import java.util.ArrayList;

public class Airline {
	private String name; // Name of the airline
	private ArrayList<Flight> flights = new ArrayList<Flight>(); // Information about all of the flights
	private ArrayList<Flight> matchingFlights = new ArrayList<Flight>(); // Has all the flights from the function findFlights()
	
	// Default Constructor
	public Airline() { name = "Imperial Airlines"; }
	
	// Getter functions--------------------
	public String getName() { return name; }
	
	public Flight getFlight(int flightNumber) { return flights.get(flightNumber); }
	
	public ArrayList<Flight> getMatchingFlights() { return matchingFlights; }
	
	public int getNumberOfFlights() { return flights.size(); }
	
	// Setter Functions---------------------

	
	// Class Methods------------------------
	
	// Cancels a ticket
	public void cancel(Ticket t) { 
		int flightNum = Integer.parseInt(t.getMyFlight() );
		System.out.println(t.getMyPassenger() + " has been refunded $" + t.getTicketPrice() );
		flights.get(flightNum).remove(t);
	}
	
	/* Issues a refund -- it just prints a message to the screen about which
	 * passenger has been credited how much money since in this simulation
	 * bank balances are not tracked for passengers
	 */ 
	public void issueRefund(Ticket t) { System.out.println(t.getMyPassenger() + " has been refunded $" + t.getTicketPrice() ); }
	
	// Shows all the current flights and their information for this airline
	public void showFlights() {
		for (int i = 0; i < flights.size(); i++) {
			System.out.print(getName() + " " + flights.get(i).getFlightNumber() + " "+ flights.get(i).getDate() + " ");
			System.out.printf("%.02f", flights.get(i).getDepartureTime() );
			System.out.print( " from " + flights.get(i).getOrigin() + " to " + flights.get(i).getDestination() + " ticket cost $" + flights.get(i).getCost() );
			System.out.println();
		}
	}
	
	// Finds all flights for a 4 hour departure window
	public ArrayList<Flight> findFlights(String date, double time, String origin) {
		matchingFlights.clear();
		for (int i = 0; i < flights.size(); i++) {
			if (flights.get(i).matches(date, time, origin) ) {
				matchingFlights.add(flights.get(i) );
			}
		}
		
		return matchingFlights;
	}
	
	// Shows all the matching flights that the passenger requested
	public void showMatchingFlights() {
		for (int i = 0; i < matchingFlights.size(); i++) {
			System.out.print(getName() + " " + matchingFlights.get(i).getFlightNumber() + " " + matchingFlights.get(i).getDate() + " ");
			System.out.printf("%.2f", matchingFlights.get(i).getDepartureTime() );
			System.out.print(" from " + matchingFlights.get(i).getOrigin() + " to " + matchingFlights.get(i).getDestination() + " ticket cost $" + matchingFlights.get(i).getCost() );
			System.out.println();
		}
	}
	
	// Books a passenger on a flight
	public Ticket book(Passenger p, Flight f) {
		Ticket t = new Ticket();
		f.addTicket(t);
		p.bookFlight(p.getFirstName(), p.getLastName(), name, f);
		return t;
	}
	
	// Gives the cost of a ticket for a particular flight. Devise your own sensible pricing
	// policy so that tickets get more expensive as a flight fills up.
	public double cost(Flight f) { return f.getCost(); }
	
	// Creates a new flight for the Airline and makes sure that this flight operates every day.
	public void createFlight(double time, int numSeats, String from, String to) {
		Flight flight = new Flight(time, numSeats, from, to);
		flights.add(flight);
	}
}

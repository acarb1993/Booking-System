import java.util.ArrayList;

public class Airline {
	private String name; // Name of the airline
	private ArrayList<Flight> flights = new ArrayList<Flight>(); // Information about all of the flights
	
	// Default Constructor
	public Airline() {
		name = "Imperial Airlines";
	}
	
	// Getter functions--------------------
	public String getName() { return name; }
	
	// Class Methods------------------------
	
	// Cancels a ticket
	public void cancel(Ticket t) {
		
	}
	
	/* Issues a refund -- it just prints a message to the screen about which
	 * passenger has been credited how much money since in this simulation
	 * bank balances are not tracked for passengers
	 */ 
	public void issueRefund(Ticket t) {
		
	}
	
	// Finds all flights for a 4 hour departure window
	public ArrayList<Flight> findFlights(String date, double time, String origin) {
		
	}
	
	// Books a passenger on a flight
	public Ticket book(Passenger p, Flight f) {
		
	}
	
	// Gives the cost of a ticket for a particular flight. Devise you own a sensible pricing
	// policy so that tickets get more expensive as a flight fills up.
	public double cost(Flight f) {
		
	}
	
	// Creates a new flight for the Airline and makes sure that this flight operates every day.
	public void createFlight(double time, int numSeats, String from, String to) {
	
	}
}

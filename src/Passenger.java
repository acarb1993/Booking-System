import java.util.ArrayList;

public class Passenger {
	private String firstName, lastName, address, phone;
	private ArrayList<Ticket> myTickets = new ArrayList<Ticket>();
	private static int numberOfTickets;
	
	// Default Constructor
	public Passenger(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		address = "";
		phone = "";
	}
	
	// Getter Functions-------------------------------
	public String getFirstName() { return firstName; }
	
	public String getLastName() { return lastName; }
	
	public String getAddress() { return address; }
	
	public String getPhone() { return phone; }
	
	public int getNumberOfTickets() { return numberOfTickets; }
	
	// Setter Functions------------------------------
	public void setAddress(String a) { address = a; }
	
	public void setPhone(String p) { phone = p; } 
	
	// Class Methods------------------------------------------------------------------------
	
	// Shows all tickets a passenger has
	public void showTickets() {
		for (int i = 0; i < myTickets.size(); i++) {
			System.out.println(myTickets.get(i).getMyPassenger() + " booked on " + myTickets.get(i).getMyAirline() + " flight number "
					+ myTickets.get(i).getMyFlight() + " on " + myTickets.get(i).getMyDate() + " at " 
					+ myTickets.get(i).getMyTicketTime() + " " + myTickets.get(i).getMyFlightDestination() );
		}
	}
	
	// cancels the passenger's ticket t
	public void cancel(Ticket t) { // TODO actually cancel the ticket
		numberOfTickets--;
	}
	
	/* Finds all flights for an airline on a particular date within 4 hours of a 
	 * particular departure time from a particular city.
	 */
	public ArrayList<Flight> findFlights(Airline a, String date, double time, String from) { // TODO, Put flights in List
		ArrayList<Flight> matchingFlights = new ArrayList<Flight>();
		
		a.findFlights(date, time, from);
		
		return matchingFlights;
	}
	
	// Books a ticket for a particular flight (for the passenger)
	public Ticket bookFlight(String firstName, String lastName, String airline, Flight f) {
		
		Ticket t = new Ticket();
		f.addTicket(t);
		myTickets.add(t);
		
		t.setMyPassenger(firstName, lastName);
		t.setMyAirline(airline);
		t.setMyFlight(f.getFlightNumber());
		t.setMyDate(f.getDate() );
		t.setMyTicketTime(f.getDepartureTime() );
		t.setMyFlightDestination(f.getOrigin(), f.getDestination());
		
		return t;
	}
	
	// Reports where the passenger holds a particular ticket
	public boolean holdsTicket(Ticket t) {
		return true;
	}
}

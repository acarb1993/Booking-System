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
		for (int i = 0; i < numberOfTickets; i++) {
			System.out.println("Ticket No. " + myTickets.get(i));
		}
	}
	
	// cancels the passenger's ticket t
	public void cancel(Ticket t) {
		t = null;	
	}
	
	// Finds all flights for an airline on a particular date within 4 hours of a 
	// particular departure time from a particular city.
	public ArrayList<Flight> findFlights(Airline a, String date, double time, String from) {
		
	}
	
	// Books a ticket for a particular flight (for the passenger)
	public Ticket bookFlight(Flight f) {
		
	}
	
	public boolean holdsTicket(Ticket t) {
		
	}
}

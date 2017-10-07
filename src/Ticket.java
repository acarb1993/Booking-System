
public class Ticket {
	private int ticketNumber;
	private double myPrice;
	private String myAirline, myPassenger, myFlight;
	static private int counter; // Creates a new ticket number everytime a ticket is initialized
	
	// Default Constructor
	public Ticket() {
		counter++;
		ticketNumber = counter;
	}
}

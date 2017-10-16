
public class Ticket {
	private int ticketNumber;
	private double myPrice;
	private String myAirline, myPassenger, myFlight;
	static private int counter; // Creates a new ticket number every time a ticket is initialized
	
	// Default Constructor
	public Ticket() {
		counter++;
		ticketNumber = counter;
	}
	
	// Getter Methods---------------------
	public int getTicketNumber() { return ticketNumber; }
	
	public double getTicketPrice() { return myPrice; }
	
	// Class Methods------
	
	// Cancels the ticket
	public void cancel() {
		
	}
}
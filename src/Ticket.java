
public class Ticket {
	private int ticketNumber;
	private double myPrice, myTicketTime;
	private String myAirline, myPassenger, myFlight, myDate, myFlightDestination;
	static private int counter = 0; // Creates a new ticket number every time a ticket is initialized
	
	// Default Constructor
	public Ticket() {
		counter++;
		ticketNumber = counter;
	}
	
	// Getter Methods---------------------
	public int getTicketNumber() { return ticketNumber; }
	
	public double getTicketPrice() { return myPrice; }
	
	public String getMyAirline() { return myAirline; }
	
	public String getMyPassenger() { return myPassenger; }
	
	public String getMyFlight() { return myFlight; }
	
	public String getMyDate() { return myDate;}
	
	public double getMyTicketTime() { return myTicketTime; }
	
	public String getMyFlightDestination() { return myFlightDestination; }
	
	//Setter Method-----------------------
	public void setMyAirline(String airlineName) { myAirline = airlineName; }
	
	public void setMyPassenger(String firstName, String lastName) { myPassenger = firstName + " " + lastName; }
	
	public void setMyFlight(int flightNumber) { myFlight = Integer.toString(flightNumber); }
	
	public void setTicketPrice(double price) { myPrice = price; }
	
	public void setMyDate(String date) { myDate = date; }
	
	public void setMyTicketTime(double ticketTime) { myTicketTime = ticketTime; } 
	
	public void setMyFlightDestination(String origin, String from) { myFlightDestination = origin + " to " + from; }
	
	// Class Methods------
	
	// Cancels the ticket
	public void cancel() { // TODO actually cancel the ticket
		
	}
}

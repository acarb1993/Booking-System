import java.util.ArrayList;

public class Flight {
	private int flightNumber, seats, filledSeats = 0;
	private double flightLength;
	private static int counter; // Creates a new flight number, when a flight is initialized
	private String date, originAirport, destination, departureTime;
	private Airline airline;
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	// Default Constructor
	public Flight() {
		flightNumber = 0;	
		seats = 200;
		counter = 0;
		date = "";
	}
	
	// Class Methods---------------------------------------------
	
	// Does the flight match date d, time t, and originAirport from 
	// to within a 4 hour departure window? 
	public boolean matches(String d, double t, String from) {
	
	}
	
	// Are there any seats left?
	public boolean hasSpace() {
		
	}
	
	// Add a newly issued ticket to the flight
	void addTicket(Ticket t) {
		
	}
	
	// Does the flight already hold a particular ticket?
	boolean holdsTicket(Ticket ticket) {
		
	}
	
	// Remove a canceled ticket from the flight
	void remove(Ticket ticket) {
		
	}
	
	// Use the flight's airline's method to generate the cost of the next ticket
	// for this flight
	double getCost() {
		
	}
}
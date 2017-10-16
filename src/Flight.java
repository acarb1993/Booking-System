import java.util.ArrayList;
import java.util.Random;

public class Flight {
	private int flightNumber, seats, filledSeats;
	private double flightLength, departureTime;
	private static int counter; // Creates a new flight number, when a flight is initialized
	private String date, originAirport, destination;
	private Airline airline;
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	private Random r = new Random();
	
	// Default Constructor
	public Flight() {
		flightNumber = counter;
		seats = r.nextInt(250 - 150) + 150;
		filledSeats = 0;
		counter = 0;
		date = "";
	}
	
	// Getter Methods-----------------------------------------
	public int getFlightNumber() { return flightNumber; }
	
	public int getSeats() { return seats; }
	
	public int getFilledSeats() { return filledSeats; }
	
	public double getFlightLength() { return flightLength; }
	
	public double getDepartureTime() { return departureTime; }
	
	public String getDate() { return date; }
	
	public String getOrigin() { return originAirport; }
	
	public String getDestination() { return destination; }
	
	
	public Airline getAirline() { return airline; }
	
	// Class Methods---------------------------------------------
	
	// Does the flight match date d, time t, and originAirport from 
	// to within a 4 hour departure window? 
	public boolean matches(String d, double t, String from) {
		if (d.equals(date) ) {
			if ( (t - departureTime) >= 4 && from.equals(destination) ) {
				return true;
			}
		}
		return false;
	}
	
	// Are there any seats left?
	public boolean hasSpace() {
		if ( (filledSeats - seats) == 0) {
			return false;
		}
		else return true;
	}
	
	// Add a newly issued ticket to the flight
	void addTicket(Ticket t) {
		t = new Ticket();
		tickets.add(t);
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
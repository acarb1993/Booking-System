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
}
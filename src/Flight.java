import java.util.ArrayList;

public class Flight {
	private int flightNumber, seats, filledSeats, flightLength;
	private static int counter; // Keeps of the different flights
	private String date, originAirport, destination, departureTime;
	private Airline airline;
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	public Flight() {
		
	}
}

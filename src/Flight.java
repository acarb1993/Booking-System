import java.util.ArrayList;

public class Flight {
	private int flightNumber, seats, filledSeats;
	private double flightLength, departureTime, price;
	private static int counter = 0; // Creates a new flight number, when a flight is initialized
	private String date, originAirport, destination;
	private Airline airline;
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	// Default Constructor
	public Flight(double departureTime, int seats, String originAirport, String destination) {
		this.departureTime = departureTime;
		this.seats = seats;
		this.originAirport = originAirport;
		this.destination = destination;
		
		date = "10/1/17";
		counter++;
		flightNumber = counter;
		filledSeats = 0;
		price = 100;
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
	
	public ArrayList<Ticket> getTickets() { return tickets; }
	
	// Gets a ticket at a particular index
	public Ticket getTicket(int index) { return tickets.get(index); }
	
	public Airline getAirline() { return airline; }
	
	// Setter Methods--------------------------------------------------
	
	// Sets the day in October
	public void setDate(int d) {
		String newDate = Integer.toString(d);
		date = date.substring(0, 3) + newDate + (date.substring(4, 7) );
	}
	
	// Class Methods---------------------------------------------
	
	// Does the flight match date d on that day, time t, and originAirport from 
	// to within a 4 hour departure window? 
	public boolean matches(String d, double t, String from) {
		int check = Integer.parseInt(d);
		
		if (check < 10) {
			if ( (d.charAt(0) == date.charAt(3) ) && (date.charAt(4) == '/') && (t < departureTime + 4 ) && (departureTime - 4 < t) && (from.charAt(0) == originAirport.charAt(0) )) {
				if ( (t < departureTime + 4 ) && (departureTime - 4 < t) ) {
					if ( (from.charAt(0) == originAirport.charAt(0) ) )
					return true;	
				}
			}
		}
		
		else if (check >= 10) {
			if ( (d.charAt(0) == date.charAt(3) ) && (d.charAt(1) == date.charAt(4) ) ) {
				if ( (t < departureTime + 4 ) && (departureTime - 4 < t) ) {
					if ( (from.charAt(0) == originAirport.charAt(0) ) )
					return true;	
				}
			}
		}
		
		return false;
	}
	
	// Are there any seats left?
	public boolean hasSpace() {
		if (seats > 0) { return true; }
		
		else return false;
	}
	
	// Add a newly issued ticket to the flight, as long as the flight is not at capacity
	public void addTicket(Ticket t) {	
		
		if (hasSpace() ) {
		    tickets.add(t);
		    seats--;
		    filledSeats++;
		    price += 5;
		}
		
		else System.out.println("Sorry, this flight has reached its maximum seating, please choose another flight");
	}
	
	// Remove a canceled ticket from the flight
	public void remove(Ticket ticket) { 
		for (int i = 0; i < tickets.size(); i++) {
			if (ticket.getTicketNumber() == tickets.get(i).getTicketNumber() ) {
				tickets.remove(i);
				price -= 5;
			}
		}
	}
	
	// Use the flight's airline's method to generate the cost of the next ticket
	// for this flight
	public double getCost() { return price; }
}
import java.util.ArrayList;

public class Airline {
	private String name; // Name of the airline
	private ArrayList<Flight> flights = new ArrayList<Flight>(); // Information about all of the flights
	
	// Default Constructor
	public Airline() {
		name = "Imperial Airlines";
	}
	
	// Getter functions--------------------
	public String getName() { return name; }
}

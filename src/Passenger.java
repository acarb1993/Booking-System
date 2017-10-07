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
	
	// Class Methods-----------
	public void showTickets() {
		for (int i = 0; i < numberOfTickets; i++) {
			System.out.println("Ticket No. " + myTickets.get(i));
		}
	}
}

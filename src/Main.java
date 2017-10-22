import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * The goal of this project is to create a simple simulation of a booking
 * system for a small airline that runs computer flights between two
 * cities on a daily basis. This project keeps tack of flights for the month
 * of October 2017.
 */

public class Main {
	public static void main(String[] args) {
		Airline airline = new Airline();
		
		Random randomSeats = new Random();
		Random randomMinute = new Random();
		
		Scanner keyboard = new Scanner(System.in);
		
		double hour = 0, minute = 0;
		int seats = 0, date = 1, index = 0;
		
		
		do {
			hour++;
			
			minute = randomMinute.nextInt(60) + 1;
			minute /= 100.00;
			
			seats = randomSeats.nextInt(300) + 150;
			
			airline.createFlight( (hour + minute), seats, "Kennedy", "Laguarida");
			airline.getFlight(index).setDate(date);
			
			if (hour >= 24) {
				hour = 0;
				date++;
			} 
			index++;
			
		} while (date < 32);
		
		//airline.showFlights();
		
		System.out.println("Ready to book your flights, enter your first name: ");
		String firstName = keyboard.nextLine();
		System.out.println("Last name: ");
		String lastName = keyboard.nextLine();
		
		Passenger p = new Passenger(firstName, lastName);
		
		System.out.println("Please enter your address: ");
		String address = keyboard.nextLine();
		p.setAddress(address);
		
		System.out.println("Please enter your phone number ");
		String phone = keyboard.nextLine();
		p.setPhone(phone);
		
		System.out.println("Ready to book your flights between Kennedy and Laguardia for October 2017");
		
		while(true) {
			System.out.println("Do you want to book or cancel a flight? Answer Yes or No");
			String input = keyboard.nextLine();
			char answer = input.charAt(0);
			
			if ( (answer == 'Y') || (answer == 'y') ) {
				System.out.println("Enter C to cancel a flight, K for a flight from Kennedy, or L for a flight from Laguardia");
				input = keyboard.nextLine();
				answer = input.charAt(0);
				
				if ( (answer == 'C') || (answer == 'c') ) {
					// Cancel a flight
				}
				
				else if ( (answer == 'K') || (answer == 'k') ) {
					System.out.println("Enter the day in October that you want to fly (In range from 1 - 31): ");
					String day = keyboard.nextLine();
					
					System.out.println("Enter the hour you would like to fly (In range from 1 - 24): ");
					double myHour = keyboard.nextDouble();
					
					airline.findFlights(day, myHour, "Kennedy");
					ArrayList<Flight> myMatchingFlights = new ArrayList<Flight>();
					for (int i = 0; i < airline.getMatchingFlights().size(); i++) {
						myMatchingFlights.add(airline.getMatchingFlights().get(i) );
					}
					
					System.out.println("Here are the available flights: ");
					airline.showMatchingFlights();
					
					System.out.println("Type the number of the flight you wish to book: ");
					keyboard.nextLine();
					String flightInput = keyboard.nextLine();
					
					
					System.out.println("Successfully booked ticket!");
				}
				
				else if ( (answer == 'L') || (answer == 'l') ) {
					// Show Laguardia to Kennedy Flights
				}
				
				else System.out.println("Error, invalid choice");
			}
			
			else if ( (answer == 'N') || (answer == 'n') ) {
				// Show the tickets and exit
			}
			
			else System.out.println("Error, invalid choice");
			
			
		}
		
		//airline.showFlights();
	}
}

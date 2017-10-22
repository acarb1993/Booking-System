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
	
	// Generates the flights for the airline taking an Airline as a parameter
	public static Airline generateFlights(Airline airline) {
		Random randomSeats = new Random();
		Random randomMinute = new Random();
		
		double hour = 0, minute = 0;
		double kenTimes[] = new double[24];
		double laguTimes[] = new double[24];
		
		// Generates the time for the Kennedy flights
		for (int i = 0; i < kenTimes.length; i++) {
			if (hour  > 24) { hour = 0; }
			hour++;
			minute = randomMinute.nextInt(60) + 1;
			minute /= 100.00;
			
			double flightTime = hour + minute;
			kenTimes[i] = flightTime;
		
		}
		
		// Generates the time for the Laguardia flights
		for (int i = 0; i < laguTimes.length; i++) {
			if (hour > 24) { hour = 0; }
			
			hour++;
			minute = randomMinute.nextInt(60) + 1;
			minute /= 100.00;
			
			double flightTime = hour + minute;
			laguTimes[i] = flightTime;
			
		}
		
		int seats = 0, date = 1, index = 0, timeIndex = 0;
		
		// Generates the seating and the flights themselves
		do {
			seats = randomSeats.nextInt(300) + 150;
			
			airline.createFlight( (kenTimes[timeIndex]), seats, "Kennedy", "Laguarida");
			airline.getFlight(index).setDate(date);
			
			index++;
			
			airline.createFlight( (laguTimes[timeIndex]), seats, "Laguardia", "Kennedy");
			airline.getFlight(index).setDate(date);
			
			index++;
			timeIndex++;
			
			if (timeIndex == kenTimes.length) { 
				timeIndex = 0;
				date++;
			}
			
		} while (date < 32);
		
		return airline;
	}

	
	public static void main(String[] args) {
		Airline airline = new Airline();
		Scanner keyboard = new Scanner(System.in);
		
		generateFlights(airline);
		//airline.showFlights();
		
		System.out.println("Ready to book your flights, enter your first name: ");
		String firstName = keyboard.nextLine();
		System.out.println("Last name: ");
		String lastName = keyboard.nextLine();
		
		Passenger p = new Passenger(firstName, lastName);
		
		System.out.println("Please enter your address: ");
		String address = keyboard.nextLine();
		p.setAddress(address);
		
		System.out.println("Please enter your phone number: ");
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
				
				// Cancel a flight
				if ( (answer == 'C') || (answer == 'c') ) {
		
				}
				
				// Show Kennedy to Laguardia flights
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
					int flightInput = keyboard.nextInt();
					
					for (int i = 0; i <myMatchingFlights.size(); i++) {
						if (flightInput == myMatchingFlights.get(i).getFlightNumber() ) {
							p.bookFlight(p.getFirstName(), p.getLastName(), airline.getName(), myMatchingFlights.get(i) );
							System.out.println("Successfully booked ticket!");
							keyboard.nextLine();
						}
					}
				}
				
				// Show Laguardia to Kennedy Flights
				else if ( (answer == 'L') || (answer == 'l') ) {
					System.out.println("Enter the day in October that you want to fly (In range from 1 - 31): ");
					String day = keyboard.nextLine();
					
					System.out.println("Enter the hour you would like to fly (In range from 1 - 24): ");
					double myHour = keyboard.nextDouble();
					
					airline.findFlights(day, myHour, "Laguardia");
					ArrayList<Flight> myMatchingFlights = new ArrayList<Flight>();
					for (int i = 0; i < airline.getMatchingFlights().size(); i++) {
						myMatchingFlights.add(airline.getMatchingFlights().get(i) );
					}
					
					System.out.println("Here are the available flights: ");
					airline.showMatchingFlights();
					
					System.out.println("Type the number of the flight you wish to book: ");
					keyboard.nextLine();
					int flightInput = keyboard.nextInt();
					
					for (int i = 0; i <myMatchingFlights.size(); i++) {
						if (flightInput == myMatchingFlights.get(i).getFlightNumber() ) {
							p.bookFlight(p.getFirstName(), p.getLastName(), airline.getName(), myMatchingFlights.get(i) );
							System.out.println("Successfully booked ticket!");
							keyboard.nextLine();
						}
					}
				}
				
				else System.out.println("Error, invalid choice");
			}
			
			// Show the tickets and exit
			else if ( (answer == 'N') || (answer == 'n') ) {
				System.out.println("Thank you for booking with " + airline.getName() );
				System.out.println("Here is a list of your bookings: ");
				p.showTickets();
				keyboard.close();
				System.exit(0);
			}
			
			else System.out.println("Error, invalid choice");	
			
		}
	}
}

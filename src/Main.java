import java.util.Random;
import java.util.Scanner;

/*
 * The goal of this project is to create a simple simulation of a booking
 * system for a small airline that runs computer flights between two
 * cities on a daily basis. This project keeps tack of flights for the month
 * of October 2017.
 */


public class Main {
	public static void main(String[] args) {
		Airline airline = new Airline();
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		Passenger p = new Passenger("Adam", "West");
		
		for (int i = 0; i < 2; i++) {
			airline.createFlight(5, 200, "Home", "Not Home");
		}
		
		for (int i = 0; i < 2; i++) {
			airline.showFlights();
		}
	}
}

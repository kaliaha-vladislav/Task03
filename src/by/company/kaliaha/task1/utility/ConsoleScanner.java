package by.company.kaliaha.task1.utility;

import java.util.Scanner;

public class ConsoleScanner {
	private static Scanner sc;	

	public ConsoleScanner() {
		sc = new Scanner(System.in);
	}

	public int inputInt(String message) {	
		System.out.println(message);
		
	    while (!sc.hasNextInt()) {
	        System.out.println("That not an integer!" + '\n' + message);
	        sc.next();
	    }	    
	    return sc.nextInt();
	}
	
	public int inputPositiveInt(String message) {				
		int number;
		
		do {
		    number = inputInt(message + "(the number must be positive): ");
		} while (number <= 0);	
		return number;
	}

	public int inputPositiveInt(String message, int limitation) {				
		int number;
		
		do {
		    number = inputInt(message);
		} while (number <= 0 || number > limitation);		
		return number;
	}	
	
	public double inputDouble(String message) {
		System.out.println(message);
		
	    while (!sc.hasNextDouble()) {
	        System.out.println("That not a double!" + '\n' + message);
	        sc.next();
	    }	    
	    return Rounder.roundNumber(sc.nextDouble(), 3);
	}
	
	public double inputPositiveDouble(String message) {				
		double number;
		
		do {
		    number = inputDouble(message + "(the number must be positive): ");
		} while (number <= 0);		
		return number;
	}
	
	public double inputPositiveDouble(String message, double limitation) {				
		double number;
		
		do {
		    number = inputDouble(message);
		} while (number <= 0 || number > limitation);
		return number;
	}
}
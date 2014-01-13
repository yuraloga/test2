package com.softserve.edu.main;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.softserve.edu.task225.Task225;
import com.softserve.edu.task329.Task329;
import com.softserve.edu.task562.Task562;


/**
 *
 * Class to launch tasks.
 * 
 * @version 0.1
 * @author  Logazyak Yuriy
 *
 */
public class Main {

	/* type this value to exit */
	private static final int EXIT = 99;
	
	private Main() {
		//private Constructor
	}
	
	public static void main(final String[] args) {
		/* choosen menu item */
		int choosenMI = 0;
		/* finded values stored here */
		List<? extends Number> values = null;
		/* input stream */
		Scanner in = new Scanner(System.in);
		
		while (choosenMI != Main.EXIT) {
			/* user input this */
			long n = 0;
			/* user input this, (square of the sum of digits) == m */
			long m = 0;

			Main.dispayMenu();

			try {
				choosenMI = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error: Please, input correct integer"
								   + " number (1, 2, 3 or 99 to exit).");
				choosenMI = 4;
				in.nextLine();
			}
			
			switch (choosenMI) {
			case 1:
				n = readInt("Please, input n (integer): ");
				values = new Task225().findValues(n);
				Main.printValues(values);
				break;
			case 2:
				n = readInt("Please, input n (integer): ");
				m = readInt("Please, input m (integer): ");
				values = new Task329().findValues(n, m);
				Main.printValues(values);
				break;
			case 3: 
				values = new Task562().findArmstrongNumbers(2, 4);
				Main.printValues(values);
				break;
			default:
				break;
			}
		}
		
		if (in != null) { 
			in.close();			
		}
		
		System.out.println("Good bye! Have a nice day:)");
	}
	
	/**
	 * Read integer number from input stream
	 * 
	 * @param  message Message that will be print
	 * @return parsed integer number
	 */
	private static int readInt(String message) {
		int number = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("\n" + message);
		number = in.nextInt();
		
		return number;
	}
	
	/**
	 * <p>Print Menu to choose what task to do.</p>
	 */
	private static void dispayMenu() {
		System.out.println("\n\nChoose which task you want to solve:");
		System.out.println("\t1. Find all 'q': (n mod q^2 == 0) "
				         + "&& (n mod q^3 != 0).");
		System.out.println("\t2. Find all 'x': (x < n) && "
				         + "(square of the sum of digits) == m.");
		System.out.println("\t3. Find 2,3,4 digits Armstrong numbers.");
		System.out.println("Type '" + Main.EXIT + "' to exit...");
	}
		
	/**
	 * Print {@code List<?>} values
	 * 
	 * @param values {@code List<?>} to print
	 */
	private static void printValues(List<? extends Number> values) {
		if (values.size() == 0) {
			System.out.println("\nThere is no any value,"
							   + " that satisfy conditions.");
		} else {
			System.out.println("\n############### Result ###############");
			System.out.println("Values: ");
			for (int i = 0; i < values.size(); i++) {
				System.out.print(values.get(i) + " ");
				if (((i + 1) % 10) == 0) {	//make 'newline' every 10 values
					System.out.println();	
				}
			}				
			System.out.println("\n############### ////// ###############");
		}
	}

}

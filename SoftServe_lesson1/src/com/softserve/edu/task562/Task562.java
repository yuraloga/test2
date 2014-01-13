package com.softserve.edu.task562;

import java.util.ArrayList;
import java.util.List;

/**
 * We must find 'Armstrong' numbers. The number is an 'Armstrong' number
 * if the sum of it's digits, erected in a n degree, is equal to the number.
 *  
 * Example: 153 = 1^3 + 5^3 + 3^3.
 *  
 * @version 0.1
 * @author  Logazyak Yuriy
 */
public class Task562 {
	
	public Task562() {
		//Constructor
	}
	
	/**
	 * Find 'Armstrong' numbers that consists of 'nDigits' digits
	 * 
	 * @param  nDigitsFrom	number of digits to start from	
	 * @param  nDigitsTo	number of digits	to end with
	 * @return 'Armstrong' numbers of the 'nDigitsFrom' to 
	 * 		   'nDigitsTo' digits, if nDigitsFrom <= 0 or
	 * 		   nDigitsFrom < nDigitsTo, then return null
	 */
	public List<Integer> findArmstrongNumbers(int nDigitsFrom,
											  int nDigitsTo) {
		int startValue = 1; //lowest value of the range
		int endValue = 9; 	//highest value of the range
		int end = 9;
		List<Integer> values = new ArrayList<Integer>(); //results
		
		if ((nDigitsFrom > nDigitsTo) || (nDigitsFrom <= 0)) {
			return null;
		}
		
		/* Find lowest value of the range */
		for (int i = 1; i < nDigitsFrom; i++) {
			startValue *= 10;
		}
		
		/* Find highest value of the range */
		for (int i = 1; i < nDigitsTo; i++) {
			endValue = (endValue * 10 + end);
		}
				
		/* find 'Armstrong' numbers and store them in ArrayList */
		for (int i = startValue; i <= endValue; i++) {
			int number = i;
			int sum = 0;
			
			while (number != 0) {
				int value = (int) (number % 10);
				sum += Math.pow(value, Task562.numberOfDigits(i));
				number /= 10;
			}
			
			if (sum == i) {
				values.add(i);
			}
		}
		((ArrayList<Integer>) values).trimToSize();
		
		return values;
	}
	
	/**
	 * Find the number of digits
	 * 
	 * @param  number - integer number to process 
	 * @return number of digits
	 */
	private static int numberOfDigits(int number) {
		int k = 0;
		
		while (number != 0) {
			number /= 10;
			k++;
		}		
		
		return k;
	}

}

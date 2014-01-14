package com.softserve.edu.task329;

import java.util.ArrayList;
import java.util.List;

/**
 * User input 'n' and 'm'. We must find all 'x', that satisfy conditions:
 * (x < n) && (square of the sum of digits) == m
 * 
 * @version 0.1
 * @author  yuraloga
 */
public class Task329 {
	
	public Task329() {
		//Constructor		
	}
	
	/**
	 * Find all values, that satisfy conditions:
	 * (x < n) && (square of the sum of digits) == m
	 * 
	 * @param n {@code long} number
	 * @param m {@code long} number
	 * @return {@code List<Long>} of finded values
	 */
	public List<Long> findValues(long n, long m) {
		List<Long> values = new ArrayList<Long>(); //results stored here
			
		for (long i = 1; i < n; i++) {
			int tmpValue = 0;
			
			/* check conditions */
			tmpValue = (int) Math.pow(Task329.calcDigitsSum(i), 2); 
			if (tmpValue == m) {
				values.add(i);
			}
		}
		((ArrayList<Long>) values).trimToSize();
		
		return values;
	}
	
    /**
     * Returns a sum of digits of 'number'.
     *
     * @param	integer number
     * @return  a sum of digits of 'number'.
     */
	private static int calcDigitsSum(long number) {
		int sum = 0;
		
		while (number != 0) {
			int value = (int) (number % 10);
			sum += value;
			number /= 10;
		}
		
		return sum;
	}

}

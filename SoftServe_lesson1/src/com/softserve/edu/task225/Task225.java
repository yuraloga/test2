package com.softserve.edu.task225;

import java.util.ArrayList;
import java.util.List;

/**
 * The user input 'n'. We must find all 'q', that satisfy conditions:
 * (n mod q^2 == 0) && (n mod q^3 != 0)
 * 
 * @version 0.1
 * @author  Logazyak Yuriy
 */
public class Task225 {
	
	public Task225() {
		//Constructor		
	}
	
	/**
	 * Find all values, that satisfy conditions:
	 * (n mod q^2 == 0) && (n mod q^3 != 0)
	 *  
	 * @return {@code List<Long>} values
	 */
	public List<Long> findValues(long n) {
		List<Long> values = new ArrayList<Long>();
		
		for (long i = 1; i < n; i++) {
			if (((n % (i * i)) == 0)
					&& ((n % (i * i * i)) != 0)) {
				values.add(i);
			}
		}
		((ArrayList<Long>) values).trimToSize();
		
		return values;
	}

}

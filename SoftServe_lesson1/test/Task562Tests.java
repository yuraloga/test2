import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.softserve.edu.task562.Task562;


public class Task562Tests {

	@Test
	public void testTwoDigitsArmstrongNumbers() {
		Task562 object0 = new Task562();
		List<Integer> actual = null;
		List<Integer> expected = new ArrayList<Integer>();
		
		actual = object0.findArmstrongNumbers(2, 2);
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testThreeAndFourDigitsArmstrongNumbers() {
		Task562 object0 = new Task562();
		List<Integer> actual = null;
		List<Integer> expected = new ArrayList<Integer>();
		
		expected.addAll(Arrays.asList(153, 370,371, 407, 1634, 8208, 9474));
		
		actual = object0.findArmstrongNumbers(3, 4);
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testIfZero() {
		Task562 object0 = new Task562();
		List<Integer> actual = null;
		List<Integer> expected = null;
		
		actual = object0.findArmstrongNumbers(0, 0);
		
		Assert.assertEquals(expected, actual);
	}

}

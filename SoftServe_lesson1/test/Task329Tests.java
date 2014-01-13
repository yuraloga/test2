import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import org.junit.Test;
import com.softserve.edu.task329.Task329;


public class Task329Tests {

	@Test
	public void test() {
		Task329 object0 = new Task329();
		List<Long> actual = null;
		List<Long> expected = new ArrayList<Long>();
		
		expected.add((long) 2);
		expected.add((long) 11);
		
		actual = object0.findValues(20, 4);
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testIfZero() {
		Task329 object0 = new Task329();
		List<Long> actual = null;
		List<Long> expected = new ArrayList<Long>();
		
		actual = object0.findValues(0, 0);
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testIfLessThenZero() {
		Task329 object0 = new Task329();
		List<Long> actual = null;
		List<Long> expected = new ArrayList<Long>();
		
		actual = object0.findValues(-100, -20);
		
		Assert.assertEquals(expected, actual);
	}
}

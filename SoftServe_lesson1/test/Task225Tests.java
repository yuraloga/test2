import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;
import com.softserve.edu.task225.Task225;


public class Task225Tests {

	@Test
	public void test() {
		Task225 object0 = new Task225();
		List<Long> actual = null;
		List<Long> expected = new ArrayList<Long>();
		
		expected.add((long) 2);
		expected.add((long) 5);
		expected.add((long) 10);
		
		actual = object0.findValues(100);
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testIfZero() {
		Task225 object0 = new Task225();
		List<Long> actual = null;
		List<Long> expected = new ArrayList<Long>();
		
		actual = object0.findValues(0);
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testIfLessThenZero() {
		Task225 object0 = new Task225();
		List<Long> actual = null;
		List<Long> expected = new ArrayList<Long>();
		
		actual = object0.findValues(-100);
		
		Assert.assertEquals(expected, actual);
	}
}

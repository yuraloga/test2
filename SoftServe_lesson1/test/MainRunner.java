import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.softserve.edu.task225.Task225;
import com.softserve.edu.task329.Task329;
import com.softserve.edu.task562.Task562;

@RunWith(Suite.class)
@Suite.SuiteClasses({Task225Tests.class,
					 Task329Tests.class,
					 Task562Tests.class})
public class MainRunner {

}

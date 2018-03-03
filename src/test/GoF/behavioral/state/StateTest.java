package test.GoF.behavioral.state;

import main.GoF.behavioral.state.Context;
import main.GoF.behavioral.state.LowerState;
import main.GoF.behavioral.state.UpperState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class StateTest {

	@Test
	public void stateTest() {
		Context context = new Context(new LowerState());

		assertEquals("test1", context.printMessage("TeSt1"));
		assertEquals("test2", context.printMessage("tEst2"));
		context.setState(new UpperState());
		assertEquals("TEST3", context.printMessage("test3"));
		context.setState(new LowerState());
		assertEquals("test4", context.printMessage("TEST4"));

	}
}

package test.GoF.behavioral.memento;

import main.GoF.behavioral.memento.Caretaker;
import main.GoF.behavioral.memento.Originator;
import main.GoF.behavioral.memento.StateEnum;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class MementoTest {

	@Test
	public void mementoTest() {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker(originator);

		originator.setState(StateEnum.STATE_1);
		caretaker.saveState();
		originator.setState(StateEnum.STATE_2);
		caretaker.saveState();
		originator.setState(StateEnum.STATE_3);

		assertSame(StateEnum.STATE_3, originator.getState());
		caretaker.undoState();
		assertSame(StateEnum.STATE_2, originator.getState());
		caretaker.undoState();
		assertSame(StateEnum.STATE_1, originator.getState());
	}
}

package test.GoF.behavioral.mediator;

import main.GoF.behavioral.mediator.*;
import org.junit.Test;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class MediatorTest {

	@Test
	public void mediatorTest() {
		MediatorImpl mediator = new MediatorImpl();
		Colleague tom = new TomColleague(mediator);
		Colleague peter = new PeterColleague(mediator);

		mediator.addColleague(tom);
		mediator.addColleague(peter);
		System.out.println("******* MEDIATOR TEST *******");
		tom.send("Hi Peter!");
		peter.send("Hi Tom!");
		System.out.println("*****************************");
	}
}

package test.GoF.behavioral.observer;

import main.GoF.behavioral.observer.FirstObserver;
import main.GoF.behavioral.observer.Observable;
import main.GoF.behavioral.observer.SecondObserver;
import org.junit.Test;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class ObserverTest {

	@Test
	public void observerTest() {
		Observable observable = new Observable();
		observable.addObserver(new FirstObserver());
		observable.addObserver(new SecondObserver());

		System.out.println("******* OBSERVER TEST *******");
		observable.setState1();
		observable.setState2();
		observable.setState3();
		System.out.println("*****************************");
	}
}

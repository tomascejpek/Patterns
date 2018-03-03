package main.GoF.behavioral.observer;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class FirstObserver implements Observer {

	@Override
	public void event1() {
		System.out.println("FirstObserver event1");
	}

	@Override
	public void event2() {
		System.out.println("FirstObserver event2");
	}

	@Override
	public void event3() {
		System.out.println("FirstObserver event3");
	}
}

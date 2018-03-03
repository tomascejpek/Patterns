package main.GoF.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class Observable {

	private final List<Observer> observers;

	public Observable() {
		this.observers = new ArrayList<>();
	}

	public void addObserver(final Observer observer) {
		this.observers.add(observer);
	}

	public void setState1() {
		// do something
		observers.forEach(Observer::event1);
	}

	public void setState2() {
		// do something
		observers.forEach(Observer::event2);
	}

	public void setState3() {
		// do something
		observers.forEach(Observer::event3);
	}
}

package main.GoF.behavioral.memento;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class Memento {

	private final StateEnum state;

	Memento(final StateEnum state) {
		this.state = state;
	}

	public StateEnum getSavedState() {
		return this.state;
	}
}

package main.GoF.behavioral.memento;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class Originator {

	private StateEnum state;

	public StateEnum getState() {
		return state;
	}

	public void setState(final StateEnum newState) {
		this.state = newState;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void restoreStateFromMemento(final Memento memento) {
		this.state = memento.getSavedState();
	}
}

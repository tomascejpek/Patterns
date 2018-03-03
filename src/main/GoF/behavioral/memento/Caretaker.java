package main.GoF.behavioral.memento;

import java.util.Stack;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class Caretaker {

	private final Originator originator;
	private final Stack<Memento> history;

	public Caretaker(final Originator originator) {
		this.originator = originator;
		this.history = new Stack<>();
	}

	public void saveState() {
		history.push(originator.saveStateToMemento());
	}

	public void undoState() {
		originator.restoreStateFromMemento(history.pop());
	}
}

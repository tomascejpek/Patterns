package main.GoF.behavioral.state;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class Context {

	private State state;

	public Context(final State state) {
		this.state = state;
	}

	public void setState(final State state) {
		this.state = state;
	}

	public String printMessage(final String message) {
		return state.print(message);
	}
}

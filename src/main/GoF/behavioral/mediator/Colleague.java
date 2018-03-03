package main.GoF.behavioral.mediator;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public abstract class Colleague {

	private final Mediator mediator;

	Colleague(final Mediator mediator) {
		this.mediator = mediator;
	}

	public void send(final String message) {
		this.mediator.send(message, this);
	}

	public abstract void receive(String message);
}

package main.GoF.behavioral.mediator;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class TomColleague extends Colleague {

	public TomColleague(final Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receive(final String message) {
		System.out.println("Tom received: " + message);
	}
}

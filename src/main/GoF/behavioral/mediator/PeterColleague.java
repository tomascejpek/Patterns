package main.GoF.behavioral.mediator;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class PeterColleague extends Colleague {

	public PeterColleague(final Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receive(final String message) {
		System.out.println("Peter received: " + message);
	}
}

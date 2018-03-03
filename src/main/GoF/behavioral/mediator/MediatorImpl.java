package main.GoF.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class MediatorImpl implements Mediator {

	private final List<Colleague> colleagues;

	public MediatorImpl() {
		this.colleagues = new ArrayList<>();
	}

	public void addColleague(final Colleague colleague) {
		this.colleagues.add(colleague);
	}

	@Override
	public void send(final String message, final Colleague originator) {
		for (Colleague colleague : this.colleagues) {
			if (colleague != originator) colleague.receive(message);
		}
	}
}

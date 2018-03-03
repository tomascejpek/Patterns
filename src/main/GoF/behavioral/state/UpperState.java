package main.GoF.behavioral.state;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class UpperState implements State {

	@Override
	public String print(final String message) {
		return message.toUpperCase();
	}
}

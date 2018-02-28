package main.GoF.behavioral.command;

/**
 * Created by Tomas Cejpek on 28/02/2018.
 */
public class PrintCommand implements Command {

	private final String text;

	public PrintCommand(String text) {
		this.text = text;
	}

	@Override
	public String execute() {
		return text;
	}
}

package main.GoF.behavioral.interpreter;

/**
 * Created by Tomas Cejpek on 02/03/2018.
 */
public class VariableExpression implements Expression {

	private final String name;

	public VariableExpression(final String name) {
		this.name = name;
	}

	@Override
	public int evaluate(final Context variables) {
		return variables.getVariableValue(this.name);
	}
}

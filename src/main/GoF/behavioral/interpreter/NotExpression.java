package main.GoF.behavioral.interpreter;

/**
 * Created by Tomas Cejpek on 02/03/2018.
 */
public class NotExpression implements Expression {

	private final Expression expression;

	public NotExpression(final Expression expression) {
		this.expression = expression;
	}

	@Override
	public int evaluate(final Context variables) {
		return -expression.evaluate(variables);
	}
}

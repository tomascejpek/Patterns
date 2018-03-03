package main.GoF.behavioral.interpreter;

/**
 * Created by Tomas Cejpek on 02/03/2018.
 */
public class PlusExpression implements Expression {

	private final Expression leftExpression;
	private final Expression rightExpression;

	public PlusExpression(final Expression leftExpression, final Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public int evaluate(final Context variables) {
		return leftExpression.evaluate(variables) + rightExpression.evaluate(variables);
	}
}

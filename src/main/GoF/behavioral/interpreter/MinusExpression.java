package main.GoF.behavioral.interpreter;

/**
 * Created by Tomas Cejpek on 02/03/2018.
 */
public class MinusExpression implements Expression {

	private final Expression leftExpression;
	private final Expression rightExpression;

	public MinusExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public int evaluate() {
		return leftExpression.evaluate() - rightExpression.evaluate();
	}
}

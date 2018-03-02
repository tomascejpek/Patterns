package main.GoF.behavioral.interpreter;

/**
 * Created by Tomas Cejpek on 02/03/2018.
 */
public class NumberExpression implements Expression {

	private final int number;

	public NumberExpression(int number) {
		this.number = number;
	}

	@Override
	public int evaluate() {
		return number;
	}
}

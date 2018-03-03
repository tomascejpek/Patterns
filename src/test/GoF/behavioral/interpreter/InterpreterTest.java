package test.GoF.behavioral.interpreter;

import main.GoF.behavioral.interpreter.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tomas Cejpek on 02/03/2018.
 */
public class InterpreterTest {

	private static final Expression VAR_A = new VariableExpression("a");
	private static final Expression VAR_B = new VariableExpression("b");
	private static final Expression VAR_C = new VariableExpression("c");
	private static final Expression VAR_D = new VariableExpression("d");
	private static final Expression VAR_E = new VariableExpression("e");

	private static final Context CONTEXT = new Context();
	static {
		CONTEXT.setVariableValue("a", 1);
		CONTEXT.setVariableValue("b", 2);
		CONTEXT.setVariableValue("c", 3);
		CONTEXT.setVariableValue("d", 4);
		CONTEXT.setVariableValue("e", 5);
	}

	@Test
	public void plusTest() {
		// 1 + 2
		Expression plus1 = new PlusExpression(VAR_A, VAR_B);
		assertEquals(3, plus1.evaluate(CONTEXT));
		// (1 + 2) + (3 + 4)
		Expression plus2 = new PlusExpression(new PlusExpression(VAR_A, VAR_B), new PlusExpression(VAR_C, VAR_D));
		assertEquals(10, plus2.evaluate(CONTEXT));
	}

	@Test
	public void minusTest() {
		// 1 - 2
		Expression minus1 = new MinusExpression(VAR_A, VAR_B);
		assertEquals(-1, minus1.evaluate(CONTEXT));
		// (1 - 2) - (3 - 4)
		Expression minus2 = new MinusExpression(new MinusExpression(VAR_A, VAR_B), new MinusExpression(VAR_C, VAR_D));
		assertEquals(0, minus2.evaluate(CONTEXT));
	}

	@Test
	public void notTest() {
		// not 5 = -5
		assertEquals(-5, new NotExpression(VAR_E).evaluate(CONTEXT));
	}

	@Test
	public void combinedTest() {
		// not 1 + ((2 + 3) - (4 - 5))
		Expression expression = new PlusExpression(new NotExpression(VAR_A), new MinusExpression(new PlusExpression(VAR_B, VAR_C), new MinusExpression(VAR_D, VAR_E)));
		assertEquals(5, expression.evaluate(CONTEXT));
	}
}

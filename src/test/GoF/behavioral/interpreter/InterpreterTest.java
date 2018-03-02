package test.GoF.behavioral.interpreter;

import main.GoF.behavioral.interpreter.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tomas Cejpek on 02/03/2018.
 */
public class InterpreterTest {

	private static final Expression INT1 = new NumberExpression(1);
	private static final Expression INT2 = new NumberExpression(2);
	private static final Expression INT3 = new NumberExpression(3);
	private static final Expression INT4 = new NumberExpression(4);
	private static final Expression INT5 = new NumberExpression(5);

	@Test
	public void plusTest() {
		// 1 + 2
		Expression plus1 = new PlusExpression(INT1, INT2);
		assertEquals(3, plus1.evaluate());
		// (1 + 2) + (3 + 4)
		Expression plus2 = new PlusExpression(new PlusExpression(INT1, INT2), new PlusExpression(INT3, INT4));
		assertEquals(10, plus2.evaluate());
	}

	@Test
	public void minusTest() {
		// 1 - 2
		Expression minus1 = new MinusExpression(INT1, INT2);
		assertEquals(-1, minus1.evaluate());
		// (1 - 2) - (3 - 4)
		Expression minus2 = new MinusExpression(new MinusExpression(INT1, INT2), new MinusExpression(INT3, INT4));
		assertEquals(0, minus2.evaluate());
	}

	@Test
	public void notTest() {
		// not 5 = -5
		assertEquals(-5, new NotExpression(INT5).evaluate());
	}

	@Test
	public void combinedTest() {
		// not 1 + ((2 + 3) - (4 - 5))
		Expression expression = new PlusExpression(new NotExpression(INT1), new MinusExpression(new PlusExpression(INT2, INT3), new MinusExpression(INT4, INT5)));
		assertEquals(5, expression.evaluate());
	}
}

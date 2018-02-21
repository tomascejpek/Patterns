package GoF.test.factoryMethod;

import GoF.factoryMethod.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertNotSame;

/**
 * Created by Tomas Cejpek on 21/02/2018.
 */
public class RectangleTest {

	@Test
	public void rectangleTest() {
		Rectangle rec1 = new Rectangle(1, 1);
		Rectangle rec2 = rec1.setX(1);
		Rectangle rec3 = rec2.setY(1);

		assertNotSame(rec1, rec2);
		assertNotSame(rec1, rec3);
		assertNotSame(rec2, rec3);
	}

}

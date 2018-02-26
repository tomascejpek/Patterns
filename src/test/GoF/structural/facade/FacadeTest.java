package test.GoF.structural.facade;

import main.GoF.structural.facade.ShapeEnum;
import main.GoF.structural.facade.ShapeFacade;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
public class FacadeTest {

	@Test
	public void facadeCircleTest() {
		ShapeFacade facade = new ShapeFacade();
		assertSame(ShapeEnum.CIRCLE, facade.drawCircle());
	}

	@Test
	public void facadeRectangleTest() {
		ShapeFacade facade = new ShapeFacade();
		assertSame(ShapeEnum.RECTANGLE, facade.drawRectangle());
	}
}

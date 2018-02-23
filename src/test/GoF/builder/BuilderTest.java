package test.GoF.builder;

import main.GoF.builder.BlueCarBuilder;
import main.GoF.builder.Car;
import main.GoF.builder.Director;
import main.GoF.builder.GreenCarBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tomas Cejpek on 22/02/2018.
 */
public class BuilderTest {

	private static final Director director = new Director();

	@Test
	public void greenCarBuilderTest() {
		Car green = director.build(new GreenCarBuilder());
		assertEquals(green.getWheels(), 4);
		assertEquals(green.getColor(), "green");
	}

	@Test
	public void blueCarBuilderTest() {
		Car blue = director.build(new BlueCarBuilder());
		assertEquals(blue.getWheels(), 3);
		assertEquals(blue.getColor(), "blue");
	}
}

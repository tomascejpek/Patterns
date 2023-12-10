package test.GoF.creational.factoryMethod.v2;

import main.GoF.creational.factoryMethod.v2.*;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created by Tomas Cejpek on 10/12/2023.
 */
public class FactoryMethodTest {

	@Test
	public void toyTest() {
		Creator creator = new ToyCreator();
		Product product = creator.makeProduct();
		assertSame(Toy.class, product.getClass());
		product.operation();
	}

	@Test
	public void carTest() {
		Creator creator = new CarCreator();
		Product product = creator.makeProduct();
		assertSame(Car.class, product.getClass());
		product.operation();
	}

}

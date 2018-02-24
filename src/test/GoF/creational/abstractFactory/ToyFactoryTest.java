package test.GoF.creational.abstractFactory;

import main.GoF.creational.abstractFactory.*;
import main.GoF.creational.abstractFactory.otherFactories.PlasticToyFactory;
import main.GoF.creational.abstractFactory.otherFactories.WoodenToyFactory;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created by Tomas Cejpek on 23/02/2018.
 */
public class ToyFactoryTest {

	@Test
	public void woodenToysTest() {
		ToyFactory factory = new WoodenToyFactory();

		assertSame(WoodenHorse.class, factory.createHorse().getClass());
		assertSame(WoodenLama.class, factory.createLama().getClass());
	}

	@Test
	public void plasticToysTest() {
		ToyFactory factory = new PlasticToyFactory();

		assertSame(PlasticHorse.class, factory.createHorse().getClass());
		assertSame(PlasticLama.class, factory.createLama().getClass());
	}
}

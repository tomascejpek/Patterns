package test.GoF.creational.abstractFactory;

import main.GoF.creational.abstractFactory.MaterialEnum;
import main.GoF.creational.abstractFactory.PlasticHorse;
import main.GoF.creational.abstractFactory.WoodenLama;
import main.GoF.creational.abstractFactory.abstractFactory.AbstractFactory;
import main.GoF.creational.abstractFactory.abstractFactory.PlasticFactory;
import main.GoF.creational.abstractFactory.abstractFactory.WoodenFactory;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public class AbstractToyFactoryTest {

	private static final AbstractFactory WOODEN_FACTORY = new WoodenFactory();
	private static final AbstractFactory PLASTIC_FACTORY = new PlasticFactory();

	@Test
	public void testAbstractFactoryPlastic() {
		AbstractFactory abstractFactory = AbstractFactory.getFactory(MaterialEnum.PLASTIC);
		assertNotNull(abstractFactory);
		assertSame(PlasticFactory.class, abstractFactory.getClass());
		assertSame(PlasticHorse.class, abstractFactory.createHorse().getClass());
		assertSame(MaterialEnum.PLASTIC, abstractFactory.createHorse().madeOf());

	}

	@Test
	public void testAbstractFactoryWooden() {
		AbstractFactory abstractFactory = AbstractFactory.getFactory(MaterialEnum.WOOD);
		assertNotNull(abstractFactory);
		assertSame(WoodenFactory.class, abstractFactory.getClass());
		assertSame(WoodenLama.class, abstractFactory.createLama().getClass());
		assertSame(MaterialEnum.WOOD, abstractFactory.createLama().madeOf());
	}

	@Test
	public void woodenToysTest() {
		assertSame(MaterialEnum.WOOD, WOODEN_FACTORY.createHorse().madeOf());
		assertSame(MaterialEnum.WOOD, WOODEN_FACTORY.createLama().madeOf());
	}

	@Test
	public void plasticToysTest() {
		assertSame(MaterialEnum.PLASTIC, Objects.requireNonNull(PLASTIC_FACTORY).createHorse().madeOf());
		assertSame(MaterialEnum.PLASTIC, PLASTIC_FACTORY.createHorse().madeOf());
	}
}

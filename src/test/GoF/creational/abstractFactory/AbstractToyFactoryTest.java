package test.GoF.creational.abstractFactory;

import main.GoF.creational.abstractFactory.MaterialEnum;
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
	public void getFactoryTest() {
		AbstractFactory plastic = AbstractFactory.getFactory(MaterialEnum.PLASTIC);
		assertNotNull(plastic);
		assertSame(PlasticFactory.class, plastic.getClass());

		AbstractFactory wooden = AbstractFactory.getFactory(MaterialEnum.WOOD);
		assertNotNull(wooden);
		assertSame(WoodenFactory.class, wooden.getClass());
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

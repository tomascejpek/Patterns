package test.GoF.creational.abstractFactory;

import main.GoF.creational.abstractFactory.otherFactories.GetToyFactory;
import main.GoF.creational.abstractFactory.MaterialEnum;
import main.GoF.creational.abstractFactory.ToyFactory;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public class GetToyFactoryTest {

	private static final GetToyFactory MAIN_FACTORY = new GetToyFactory();

	@Test
	public void getWoodenToyFactoryTest() {
		ToyFactory woodenFactory = MAIN_FACTORY.getFactory(MaterialEnum.WOOD);

		assertSame(MaterialEnum.WOOD, woodenFactory.createHorse().madeOf());
		assertSame(MaterialEnum.WOOD, woodenFactory.createLama().madeOf());
	}

	@Test
	public void getPlasticToyFactoryTest() {
		ToyFactory plasticFactory = MAIN_FACTORY.getFactory(MaterialEnum.PLASTIC);

		assertSame(MaterialEnum.PLASTIC, plasticFactory.createHorse().madeOf());
		assertSame(MaterialEnum.PLASTIC, plasticFactory.createLama().madeOf());
	}

}

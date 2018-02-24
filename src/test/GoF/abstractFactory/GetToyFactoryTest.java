package test.GoF.abstractFactory;

import main.GoF.abstractFactory.otherFactories.GetToyFactory;
import main.GoF.abstractFactory.MaterialEnum;
import main.GoF.abstractFactory.ToyFactory;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public class GetToyFactoryTest {

	private static final GetToyFactory mainFactory = new GetToyFactory();

	@Test
	public void getWoodenToyFactoryTest() {
		ToyFactory woodenFactory = mainFactory.getFactory(MaterialEnum.WOOD);

		assertSame(MaterialEnum.WOOD, woodenFactory.createHorse().madeOf());
		assertSame(MaterialEnum.WOOD, woodenFactory.createLama().madeOf());
	}

	@Test
	public void getPlasticToyFactoryTest() {
		ToyFactory plasticFactory = mainFactory.getFactory(MaterialEnum.PLASTIC);

		assertSame(MaterialEnum.PLASTIC, plasticFactory.createHorse().madeOf());
		assertSame(MaterialEnum.PLASTIC, plasticFactory.createLama().madeOf());
	}

}

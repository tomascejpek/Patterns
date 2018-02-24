package main.GoF.abstractFactory.abstractFactory;

import main.GoF.abstractFactory.MaterialEnum;
import main.GoF.abstractFactory.Toy;
import main.GoF.abstractFactory.ToyFactory;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public abstract class AbstractFactory implements ToyFactory {

	public static AbstractFactory getFactory(MaterialEnum material) {
		switch (material) {
			case WOOD:
				return new WoodenFactory();
			case PLASTIC:
				return new PlasticFactory();
			default:
				return null;
		}
	}

	public abstract Toy createHorse();

	public abstract Toy createLama();
}

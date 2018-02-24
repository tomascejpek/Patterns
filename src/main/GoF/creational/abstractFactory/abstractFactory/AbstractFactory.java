package main.GoF.creational.abstractFactory.abstractFactory;

import main.GoF.creational.abstractFactory.MaterialEnum;
import main.GoF.creational.abstractFactory.Toy;
import main.GoF.creational.abstractFactory.ToyFactory;

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

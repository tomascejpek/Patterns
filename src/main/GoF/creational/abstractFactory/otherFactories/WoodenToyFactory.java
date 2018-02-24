package main.GoF.creational.abstractFactory.otherFactories;

import main.GoF.creational.abstractFactory.Toy;
import main.GoF.creational.abstractFactory.ToyFactory;
import main.GoF.creational.abstractFactory.WoodenHorse;
import main.GoF.creational.abstractFactory.WoodenLama;

/**
 * Created by Tomas Cejpek on 23/02/2018.
 */
public class WoodenToyFactory implements ToyFactory {

	@Override
	public Toy createHorse() {
		return new WoodenHorse();
	}

	@Override
	public Toy createLama() {
		return new WoodenLama();
	}
}

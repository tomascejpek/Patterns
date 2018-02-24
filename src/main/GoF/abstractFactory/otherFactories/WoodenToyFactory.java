package main.GoF.abstractFactory.otherFactories;

import main.GoF.abstractFactory.Toy;
import main.GoF.abstractFactory.ToyFactory;
import main.GoF.abstractFactory.WoodenHorse;
import main.GoF.abstractFactory.WoodenLama;

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

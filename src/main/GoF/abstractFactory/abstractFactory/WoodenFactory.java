package main.GoF.abstractFactory.abstractFactory;

import main.GoF.abstractFactory.Toy;
import main.GoF.abstractFactory.WoodenHorse;
import main.GoF.abstractFactory.WoodenLama;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public class WoodenFactory extends AbstractFactory {

	@Override
	public Toy createHorse() {
		return new WoodenHorse();
	}

	@Override
	public Toy createLama() {
		return new WoodenLama();
	}
}

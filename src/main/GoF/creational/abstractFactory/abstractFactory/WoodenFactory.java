package main.GoF.creational.abstractFactory.abstractFactory;

import main.GoF.creational.abstractFactory.Toy;
import main.GoF.creational.abstractFactory.WoodenHorse;
import main.GoF.creational.abstractFactory.WoodenLama;

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

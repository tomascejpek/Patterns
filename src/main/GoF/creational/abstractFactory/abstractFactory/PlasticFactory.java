package main.GoF.creational.abstractFactory.abstractFactory;

import main.GoF.creational.abstractFactory.PlasticHorse;
import main.GoF.creational.abstractFactory.PlasticLama;
import main.GoF.creational.abstractFactory.Toy;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public class PlasticFactory extends AbstractFactory {

	@Override
	public Toy createHorse() {
		return new PlasticHorse();
	}

	@Override
	public Toy createLama() {
		return new PlasticLama();
	}
}

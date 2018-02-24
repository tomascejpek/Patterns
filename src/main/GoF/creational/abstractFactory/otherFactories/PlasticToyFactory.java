package main.GoF.creational.abstractFactory.otherFactories;

import main.GoF.creational.abstractFactory.PlasticHorse;
import main.GoF.creational.abstractFactory.PlasticLama;
import main.GoF.creational.abstractFactory.Toy;
import main.GoF.creational.abstractFactory.ToyFactory;

/**
 * Created by Tomas Cejpek on 23/02/2018.
 */
public class PlasticToyFactory implements ToyFactory {

	@Override
	public Toy createHorse() {
		return new PlasticHorse();
	}

	@Override
	public Toy createLama() {
		return new PlasticLama();
	}
}

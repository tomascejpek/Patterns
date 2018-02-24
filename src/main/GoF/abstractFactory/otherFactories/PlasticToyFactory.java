package main.GoF.abstractFactory.otherFactories;

import main.GoF.abstractFactory.PlasticHorse;
import main.GoF.abstractFactory.PlasticLama;
import main.GoF.abstractFactory.Toy;
import main.GoF.abstractFactory.ToyFactory;

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

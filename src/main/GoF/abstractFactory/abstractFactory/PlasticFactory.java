package main.GoF.abstractFactory.abstractFactory;

import main.GoF.abstractFactory.PlasticHorse;
import main.GoF.abstractFactory.PlasticLama;
import main.GoF.abstractFactory.Toy;

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

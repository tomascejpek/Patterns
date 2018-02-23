package main.GoF.abstractFactory;

/**
 * Created by Tomas Cejpek on 23/02/2018.
 */
public class PlasticToyFactory implements  ToyFactory {
	@Override
	public Toy createHorse() {
		return new PlasticHorse();
	}

	@Override
	public Toy createLama() {
		return new PlasticLama();
	}
}

package main.GoF.abstractFactory;

/**
 * Created by Tomas Cejpek on 23/02/2018.
 */
public class WoodenToyFactory implements  ToyFactory {
	@Override
	public Toy createHorse() {
		return new WoodenHorse();
	}

	@Override
	public Toy createLama() {
		return new WoodenLama();
	}
}

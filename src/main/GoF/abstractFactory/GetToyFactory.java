package main.GoF.abstractFactory;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public class GetToyFactory {

	public ToyFactory getFactory(MaterialEnum material) {
		switch (material) {
			case WOOD:
				return new WoodenToyFactory();
			case PLASTIC:
				return new PlasticToyFactory();
			default:
				return null;
		}
	}
}

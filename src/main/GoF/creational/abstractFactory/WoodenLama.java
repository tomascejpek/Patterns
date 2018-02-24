package main.GoF.creational.abstractFactory;

/**
 * Created by Tomas Cejpek on 23/02/2018.
 */
public class WoodenLama implements Toy {

	@Override
	public MaterialEnum madeOf() {
		return MaterialEnum.WOOD;
	}
}

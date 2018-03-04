package main.GoF.behavioral.strategy;

/**
 * Created by Tomas Cejpek on 04/03/2018.
 */
public class HappyHoursStrategy implements Strategy {

	@Override
	public double getPrice(final double price) {
		return price * 0.5;
	}
}

package Builder;

/**
 * Created by Tomas Cejpek on 20/02/2018.
 */
public class Director {

	/**
	 * create new Car, set wheels, color a return Car
	 * @param builder - specific builder
	 * @return specific car
	 */

	public Car build(Builder builder) {
		builder.buildNew();
		builder.setWheels();
		builder.setColor();
		return builder.getCar();
	}
}

package Builder;

/**
 * Created by Tomas Cejpek on 20/02/2018.
 */
public class GreenCarBuilder implements Builder {
	private Car car;

	@Override
	public void buildNew() {
		this.car = new Car();
	}

	@Override
	public void setWheels() {
		this.car.setWheels(4);
	}

	@Override
	public void setColor() {
		this.car.setColor("green");
	}

	@Override
	public Car getCar() {
		return this.car;
	}
}

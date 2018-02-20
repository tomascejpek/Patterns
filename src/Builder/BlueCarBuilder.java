package Builder;

/**
 * Created by Tomas Cejpek on 20/02/2018.
 */
public class BlueCarBuilder implements Builder {
	private Car car;

	@Override
	public void buildNew() {
		this.car = new Car();
	}

	@Override
	public void setWheels() {
		this.car.setWheels(3);
	}

	@Override
	public void setColor() {
		this.car.setColor("blue");
	}

	@Override
	public Car getCar() {
		return this.car;
	}
}

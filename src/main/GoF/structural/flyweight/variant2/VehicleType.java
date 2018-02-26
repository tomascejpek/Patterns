package main.GoF.structural.flyweight.variant2;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
public class VehicleType {

	private int wheels;
	private String size;

	public VehicleType(int wheels, String size) {
		this.wheels = wheels;
		this.size = size;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {

		this.wheels = wheels;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}

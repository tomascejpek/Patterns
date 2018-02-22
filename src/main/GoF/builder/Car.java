package main.GoF.builder;

/**
 * Created by Tomas Cejpek on 20/02/2018.
 */
public class Car {
	private int wheels;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Car{" +
				"wheels=" + wheels +
				", color='" + color + '\'' +
				'}';
	}
}

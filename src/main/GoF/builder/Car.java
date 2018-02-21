package main.GoF.builder;

/**
 * Created by Tomas Cejpek on 20/02/2018.
 */
public class Car {
	private int wheels;
	private String color;

	public void setColor(String color) {
		this.color = color;
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

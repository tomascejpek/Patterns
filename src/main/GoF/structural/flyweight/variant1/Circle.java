package main.GoF.structural.flyweight.variant1;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
@SuppressWarnings({"unused", "FieldCanBeLocal"})
public class Circle implements Shape {

	private final String Color;
	private int x;
	private int y;
	private int radius;

	public Circle(String color) {
		Color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public Shape draw() {
		return this;
	}
}

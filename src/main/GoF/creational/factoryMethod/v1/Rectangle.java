package main.GoF.creational.factoryMethod.v1;

/**
 * Created by Tomas Cejpek on 21/02/2018.
 */
public class Rectangle {
	private final int x;
	private final int y;

	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Rectangle setX(int x) {
		return new Rectangle(x, this.y);
	}

	public Rectangle setY(int y) {
		return new Rectangle(this.x, y);
	}

}

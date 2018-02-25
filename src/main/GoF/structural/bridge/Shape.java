package main.GoF.structural.bridge;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class Shape {

	private final Drawer drawer;

	public Shape(Drawer drawer) {
		this.drawer = drawer;
	}

	public CircleEnum drawCircle() {
		return drawer.drawCircle();
	}
}

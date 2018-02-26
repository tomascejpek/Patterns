package main.GoF.structural.facade;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
public class ShapeFacade {

	private final Circle circle;
	private final Rectangle rectangle;

	public ShapeFacade() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
	}

	public ShapeEnum drawCircle() {
		return circle.draw();
	}

	public ShapeEnum drawRectangle() {
		return rectangle.draw();
	}
}

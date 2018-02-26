package main.GoF.structural.facade;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
public class Circle implements Shape {

	@Override
	public ShapeEnum draw() {
		return ShapeEnum.CIRCLE;
	}
}

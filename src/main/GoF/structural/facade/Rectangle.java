package main.GoF.structural.facade;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
public class Rectangle implements Shape {

	@Override
	public ShapeEnum draw() {
		return ShapeEnum.RECTANGLE;
	}
}

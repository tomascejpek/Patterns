package main.GoF.structural.flyweight.variant1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
public class ShapeFactory {

	private final Map<String, Circle> circleCache = new HashMap<>();

	public Circle getCircle(String color) {
		if (circleCache.containsKey(color)) return circleCache.get(color);

		Circle newCircle = new Circle(color);
		circleCache.put(color, newCircle);
		return newCircle;
	}
}

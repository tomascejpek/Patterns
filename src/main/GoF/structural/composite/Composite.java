package main.GoF.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class Composite implements Component {

	private final List<Component> components = new ArrayList<>();

	public void add(Component component) {
		components.add(component);
	}

	public void remove(Component component) {
		components.remove(component);
	}

	@Override
	public int doSomething() {
		int sum = 0;
		for (Component component : components) {
			sum += component.doSomething();
		}
		return sum;
	}
}

package main.GoF.structural.composite;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class Leaf implements Component {

	@Override
	public void doSomething() {
		System.out.println("print");
	}
}

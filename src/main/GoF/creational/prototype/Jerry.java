package main.GoF.creational.prototype;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public class Jerry implements Person {

	private static final String NAME = "Jerry";

	@Override
	public Person clone() throws CloneNotSupportedException {
		return (Jerry) super.clone();
	}

	@Override
	public String toString() {
		return NAME;
	}
}

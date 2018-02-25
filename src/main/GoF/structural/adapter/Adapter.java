package main.GoF.structural.adapter;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class Adapter implements NewInterface {

	private final Adaptee adaptee;

	public Adapter() {
		this.adaptee = new Adaptee();
	}

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public String newRequest() {
		return this.adaptee.oldRequest();
	}
}

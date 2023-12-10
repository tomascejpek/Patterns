package main.GoF.creational.factoryMethod.v2;

public class CarCreator implements Creator {
	@Override
	public Product makeProduct() {
		return new Car();
	}
}

package main.GoF.creational.factoryMethod.v2;

public class ToyCreator implements Creator {
	@Override
	public Product makeProduct() {
		return new Toy();
	}
}

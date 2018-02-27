package test.GoF.structural.flyweight;

import main.GoF.structural.flyweight.variant1.Circle;
import main.GoF.structural.flyweight.variant1.ShapeFactory;
import main.GoF.structural.flyweight.variant2.Vehicle;
import main.GoF.structural.flyweight.variant2.VehicleType;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
public class FlyweightTest {

	@Test
	public void flyweightFactoryTest() {
		ShapeFactory factory = new ShapeFactory();
		Circle circle1 = new Circle("red");
		Circle circle2 = new Circle("red");
		assertNotSame(circle1, circle2);
		assertSame(factory.getCircle("red"), factory.getCircle("red"));
	}

	@Test
	public void flyweightVehicleTest() {
		VehicleType smallVehicleType = new VehicleType(4, "small");

		Vehicle smallVehicle1 = new Vehicle(smallVehicleType, 100);
		Vehicle smallVehicle2 = new Vehicle(smallVehicleType, 150);

		assertNotSame(smallVehicle1, smallVehicle2);
		assertSame(smallVehicle1.getVehicleType(), smallVehicle2.getVehicleType());

		smallVehicle1.getVehicleType().setSize("very small");
		smallVehicle1.getVehicleType().setWheels(3);

		assertEquals("very small", smallVehicle2.getVehicleType().getSize());
		assertEquals(3, smallVehicle2.getVehicleType().getWheels());


	}
}

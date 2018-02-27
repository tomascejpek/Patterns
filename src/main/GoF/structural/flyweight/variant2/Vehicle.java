package main.GoF.structural.flyweight.variant2;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class Vehicle {

	private final VehicleType vehicleType;
	private final int speed;

	public Vehicle(VehicleType vehicleType, int speed) {
		this.vehicleType = vehicleType;
		this.speed = speed;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}
}

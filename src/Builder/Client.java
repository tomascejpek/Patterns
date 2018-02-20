package Builder;

/**
 * Created by Tomas Cejpek on 20/02/2018.
 */
public class Client {

	public void use() {
		Director director = new Director();

		Car greenCar = director.build(new GreenCarBuilder());

		Car blueCar = director.build(new BlueCarBuilder());
	}

}

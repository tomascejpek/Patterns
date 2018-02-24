package main.GoF.builder;

/**
 * Created by Tomas Cejpek on 20/02/2018.
 */
interface Builder {

	void buildNew();

	void setWheels();

	void setColor();

	Car getCar();
}

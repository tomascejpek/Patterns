package main.GoF.behavioral.templateMethod;

/**
 * Created by Tomas Cejpek on 04/03/2018.
 */
public class ConcreteClass2 extends Template {

	@Override
	void step1() {
		System.out.println("ConcreteClass2: step1");
	}

	@Override
	void step2() {
		System.out.println("ConcreteClass2: step2");
	}

	@Override
	void step3() {
		System.out.println("ConcreteClass2: step3");
	}

	@Override
	public void printAll() {
		step1();
		step2();
		step3();
	}
}

package main.GoF.behavioral.visitor;

/**
 * Created by Tomas Cejpek on 04/03/2018.
 */
public class Theater implements Place {

	@Override
	public void accept(Visitor visitor) {
		System.out.println(visitor.toString() + " in theater");
		visitor.visit(this);
	}
}

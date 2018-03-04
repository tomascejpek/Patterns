package main.GoF.behavioral.visitor;

/**
 * Created by Tomas Cejpek on 04/03/2018.
 */
public class TomVisitor implements Visitor {

	@Override
	public void visit(final Cinema cinema) {
		System.out.println(this.toString() + " is watching film");
	}

	@Override
	public void visit(final Theater theater) {
		System.out.println(this.toString() + " is watching theater performance");
	}

	@Override
	public String toString() {
		return "Tom";
	}
}

package main.GoF.behavioral.visitor;

/**
 * Created by Tomas Cejpek on 04/03/2018.
 */
@SuppressWarnings("unused")
public interface Visitor {

	void visit(Cinema cinema);

	void visit(Theater theater);
}

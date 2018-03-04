package main.GoF.behavioral.visitor;

/**
 * Created by Tomas Cejpek on 04/03/2018.
 */
@SuppressWarnings("unused")
interface Place {

	void accept(Visitor visitor);
}

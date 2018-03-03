package main.GoF.behavioral.mediator;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
interface Mediator {

	void send(String message, Colleague colleagues);
}

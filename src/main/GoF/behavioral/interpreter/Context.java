package main.GoF.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class Context {

	private final Map<String, Integer> variables;

	public Context() {
		this.variables = new HashMap<>();
	}

	public void setVariableValue(final String name, final int value) {
		variables.put(name, value);
	}

	public int getVariableValue(final String name) {
		return variables.get(name);
	}
}

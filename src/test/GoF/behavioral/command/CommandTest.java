package test.GoF.behavioral.command;

import main.GoF.behavioral.command.Command;
import main.GoF.behavioral.command.PrintCommand;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Tomas Cejpek on 28/02/2018.
 */
public class CommandTest {

	@Test
	public void commandTest() {
		final String testString1 = "test1";
		final String testString2 = "test2";

		Command print1 = new PrintCommand(testString1);
		Command print2 = new PrintCommand(testString2);

		assertEquals(testString1, print1.execute());
		assertEquals(testString2, print2.execute());
	}

	@Test
	public void commandTest2() {
		final String testString1 = "test1";
		final String testString2 = "test2";
		final String testString3 = "test3";
		final String testString4 = "test4";

		List<Command> commands = Arrays.asList(
				new PrintCommand(testString1),
				new PrintCommand(testString2),
				new PrintCommand(testString3),
				new PrintCommand(testString4)
		);
		List<String> expectedResults = Arrays.asList(testString1, testString2, testString3, testString4);
		List<String> results = new ArrayList<>();

		for (Command command : commands) {
			results.add(command.execute());
		}

		assertTrue(expectedResults.equals(results));
	}
}

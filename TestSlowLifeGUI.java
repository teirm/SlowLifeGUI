/* A test suite for SlowLifeGUI
   3 April 2016
   CS1653 */

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import org.mockito.Mock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.Number;

public class TestSlowLifeGUI {


	/**PINNING TESTS FOR Cell.toString()**/

	@Test
	public void newEmptyCellStringTest() {

		Cell cell_A = new Cell();

		String old_method = cell_A.old_toString();
		String new_method = cell_A.toString();

		assertEquals(old_method, new_method);
	}

	@Test
	public void newAliveCellStringTest() {

		Cell cell_A = new Cell(true);

		String old_method = cell_A.old_toString();
		String new_method = cell_A.toString();

		assertEquals(old_method, new_method);
	}

	@Test
	public void newDeadCellStringTest() {
		
		Cell cell_A = new Cell(false);

		String old_method = cell_A.old_toString();
		String new_method = cell_A.toString();

		assertEquals(old_method, new_method);
	}

	/**PINNING TESTS FOR Cell.toString()**/

	@Test
	public void convertPositiveTest() {

		int world_size = 15;
		int test_value = 89;
		MainPanel testPanel = new MainPanel(world_size);

		int old_conversion = testPanel.old_convertToInt(test_value);
		int new_conversion = testPanel.convertToInt(test_value);

		assertEquals(old_conversion, new_conversion);
	}

	@Test
	public void convertIntZeroTest() {

		int world_size = 15;
		int test_value = 0;
		
		MainPanel testPanel = new MainPanel(world_size);

		int old_conversion = testPanel.old_convertToInt(test_value);
		int new_conversion = testPanel.convertToInt(test_value);

		assertEquals(old_conversion, new_conversion);
	}

	@Test
	public void convertIntMaxTest() {

		int world_size = 15;
		int test_value = Integer.MAX_VALUE;
		
		MainPanel testPanel = new MainPanel(world_size);

		int old_conversion = testPanel.old_convertToInt(test_value);
		int new_conversion = testPanel.convertToInt(test_value);

		assertEquals(old_conversion, new_conversion);
	}



	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("TestSlowLifeGUI");
	}

}

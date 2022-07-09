import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import exercise.exercise;

class KatoDietTest {
	
	@Test
	void test1() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Bicycling");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "730.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
		
	}
	
	@Test
	void test2() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Jogging");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "730.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
		
	}
	
	@Test
	void test3() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Bicycling");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "730.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
		
	}
	
	@Test
	void test4() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Bicycling");
		boolean msg3 = e.message;
		e.setDuration("0.95");
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;

		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
		
	}
	
	@Test
	void test5() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Bicycling");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "730.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
		
	}
	
	@Test
	void test6() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Bicycling");
		boolean msg3 = e.message;
		e.setDuration(null);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;

		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);	
	}
	
	@Test
	void test7() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type(null);
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;

		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg3);
	}
	
	@Test
	void test8() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime(null);
		boolean msg2 = e.message;
		e.setExercise_type("Bicycling");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;

		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg2);
	}
	
	@Test
	void test9() {
		
		exercise e = new exercise();
		
		e.setDate(null);
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Bicycling");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;

		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test10() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Bicycling");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "730.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
		
	}
	
	@Test
	void test11() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Hiking");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "1095.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
		
	}
	
	@Test
	void test12() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Running");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "1515.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
	
	@Test
	void test13() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Swimming");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "1057.5";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
		
	}
	
	@Test
	void test14() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Walking");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "785.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
	
	@Test
	void test15() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Running");
		boolean msg3 = e.message;
		e.setDuration("0.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "303.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
	
	@Test
	void test16() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Running");
		boolean msg3 = e.message;
		e.setDuration("1");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "606.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
	
	@Test
	void test17() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Running");
		boolean msg3 = e.message;
		e.setDuration("1.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "909.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
	
	@Test
	void test18() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Running");
		boolean msg3 = e.message;
		e.setDuration("2");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "1212.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
	
	@Test
	void test19() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Running");
		boolean msg3 = e.message;
		e.setDuration("2.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "1515.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
	
	@Test
	void test20() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Running");
		boolean msg3 = e.message;
		e.setDuration("3");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "1818.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
	
	@Test
	void test21() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Running");
		boolean msg3 = e.message;
		e.setDuration("3.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "2121.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
	
	@Test
	void test22() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Running");
		boolean msg3 = e.message;
		e.setDuration("4");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "2424.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
	
	@Test
	void test23() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Running");
		boolean msg3 = e.message;
		e.setDuration("4.5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "2727.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
	
	@Test
	void test24() {
		
		exercise e = new exercise();
		
		e.setDate("16/5/2022");
		boolean msg1 = e.message;
		e.setTime("2:30");
		boolean msg2 = e.message;
		e.setExercise_type("Running");
		boolean msg3 = e.message;
		e.setDuration("5");
		boolean msg4 = e.message;
		
		e.setCaloriesBurn(e.getExercise_type(), e.getDuration());
		String actualCaloriesBurn = e.getCaloriesBurn();
		boolean expectedOutput = true;
		String expectedCaloriesBurn = "3030.0";
		
		//assertEquals - reserve words eor junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedCaloriesBurn, actualCaloriesBurn);
	}
}

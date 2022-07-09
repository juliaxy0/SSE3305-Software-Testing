import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeightTest {

	@Test
	void test1() {
		
		Weight e = new Weight();
		
		
		e.setHeight(176);
		boolean msg1 = e.message;
		e.setWeight(85);
		boolean msg2 = e.message;
		e.setStatus(27.44);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		
	}
	@Test
	void test2() {
		
		Weight e = new Weight();
		
		
		e.setHeight(76);
		boolean msg1 = e.message;
		e.setWeight(85);
		boolean msg2 = e.message;
		e.setStatus(147.2);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);

		
	}

	@Test
	void test3() {
		
		Weight e = new Weight();
		
		
		e.setHeight(376);
		boolean msg1 = e.message;
		e.setWeight(85);
		boolean msg2 = e.message;
		e.setStatus(6);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);

	}
	@Test
	void test4() {
		
		Weight e = new Weight();
		
		
		e.setHeight(176);
		boolean msg1 = e.message;
		e.setWeight(69);
		boolean msg2 = e.message;
		e.setStatus(22.3);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		
		
	}
	@Test
	void test5() {
		
		Weight e = new Weight();
		
		
		e.setHeight(176);
		boolean msg1 = e.message;
		e.setWeight(25);
		boolean msg2 = e.message;
		e.setStatus(8.1);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test6() {
		
		Weight e = new Weight();
		
		
		e.setHeight(176);
		boolean msg1 = e.message;
		e.setWeight(700);
		boolean msg2 = e.message;
		e.setStatus(226);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test7() {
		
		Weight e = new Weight();
		
		
		e.setHeight(99);
		boolean msg1 = e.message;
		e.setWeight(100);
		boolean msg2 = e.message;
		e.setStatus(102);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		
	}
	@Test
	void test8() {
		
		Weight e = new Weight();
		
		
		e.setHeight(100);
		boolean msg1 = e.message;
		e.setWeight(100);
		boolean msg2 = e.message;
		e.setStatus(100);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		
	}
	@Test
	void test9() {
		
		Weight e = new Weight();
		
		
		e.setHeight(101);
		boolean msg1 = e.message;
		e.setWeight(100);
		boolean msg2 = e.message;
		e.setStatus(98);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		
	}
	@Test
	void test10() {
		
		Weight e = new Weight();
		
		
		e.setHeight(299);
		boolean msg1 = e.message;
		e.setWeight(100);
		boolean msg2 = e.message;
		e.setStatus(11.2);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		
	}
	@Test
	void test11() {
		
		Weight e = new Weight();
		
		
		e.setHeight(300);
		boolean msg1 = e.message;
		e.setWeight(100);
		boolean msg2 = e.message;
		e.setStatus(11.1);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		
	}
	@Test
	void test12() {
		
		Weight e = new Weight();
		
		
		e.setHeight(301);
		boolean msg1 = e.message;
		e.setWeight(100);
		boolean msg2 = e.message;
		e.setStatus(11);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		
	}
	@Test
	void test13() {
		
		Weight e = new Weight();
		
		
		e.setHeight(180);
		boolean msg1 = e.message;
		e.setWeight(29);
		boolean msg2 = e.message;
		e.setStatus(9);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test14() {
		
		Weight e = new Weight();
		
		
		e.setHeight(180);
		boolean msg1 = e.message;
		e.setWeight(30);
		boolean msg2 = e.message;
		e.setStatus(9.3);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test15() {
		
		Weight e = new Weight();
		
		
		e.setHeight(180);
		boolean msg1 = e.message;
		e.setWeight(31);
		boolean msg2 = e.message;
		e.setStatus(9.6);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test16() {
		
		Weight e = new Weight();
		
		
		e.setHeight(180);
		boolean msg1 = e.message;
		e.setWeight(649);
		boolean msg2 = e.message;
		e.setStatus(200.3);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test17() {
		
		Weight e = new Weight();
		
		
		e.setHeight(180);
		boolean msg1 = e.message;
		e.setWeight(650);
		boolean msg2 = e.message;
		e.setStatus(200.6);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test18() {
		
		Weight e = new Weight();
		
		
		e.setHeight(180);
		boolean msg1 = e.message;
		e.setWeight(651);
		boolean msg2 = e.message;
		e.setStatus(200.9);
		boolean msg4 = e.message;
		
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test19() {
		
		Weight e = new Weight();
		
		e.setDateday("9/7/2022");
		boolean msg3 = e.message;
		e.setHeight(88);
		boolean msg1 = e.message;
		e.setWeight(0);
		boolean msg2 = e.message;

		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
	}
	@Test
	void test20() {
		
		Weight e = new Weight();
		
		e.setDateday("9/7/2022");
		boolean msg3 = e.message;
		e.setHeight(150);
		boolean msg1 = e.message;
		e.setWeight(25);
		boolean msg2 = e.message;

		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
	}
	@Test
	void test21() {
		
		Weight e = new Weight();
		
		e.setDateday("9/7/2022");
		boolean msg3 = e.message;
		e.setHeight(190);
		boolean msg1 = e.message;
		e.setWeight(79);
		boolean msg2 = e.message;
		e.setStatus(2.2);
		boolean msg4 = e.message;

		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
	}
	@Test
	void test22() {
		
		Weight e = new Weight();
		
		e.setDateday("9/7/2022");
		boolean msg3 = e.message;
		e.setHeight(210);
		boolean msg1 = e.message;
		e.setWeight(779);
		boolean msg2 = e.message;

		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
	}
	@Test
	void test23() {
		
		Weight e = new Weight();
		
		e.setDateday("9/7/2022");
		boolean msg3 = e.message;
		e.setHeight(400);
		boolean msg1 = e.message;
		e.setWeight(0);
		boolean msg2 = e.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
	}

	@Test
	void test24() {
		
		Weight e = new Weight();
		
		e.setDateday(null);
		boolean msg3 = e.message;
		e.setHeight(400);
		boolean msg1 = e.message;
		e.setWeight(0);
		boolean msg2 = e.message;
		

		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test25() {
		
		Weight e = new Weight();
	
		e.setWeight(70);
		boolean msg2 = e.message;
		e.setStatus(22.8);
		boolean msg4 = e.message;

		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
	}
	@Test
	void test26() {
		
		Weight e = new Weight();
	
		e.setWeight(80);
		boolean msg2 = e.message;
		e.setStatus(26.1);
		boolean msg4 = e.message;

		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
	}
	@Test
	void test27() {
		
		Weight e = new Weight();
	
		e.setWeight(601);
		boolean msg2 = e.message;
		e.setStatus(196.4);
		boolean msg4 = e.message;

		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test28() {
		
		Weight e = new Weight();
	
		e.setHeight(175);
		boolean msg2 = e.message;
		e.setStatus(26.1);
		boolean msg4 = e.message;

		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test29() {
		
		Weight e = new Weight();
	
		e.setHeight(170);
		boolean msg2 = e.message;
		e.setStatus(27.7);
		boolean msg4 = e.message;

		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg2);
		
	}
	@Test
	void test30() {
		
		Weight e = new Weight();
	
		e.setHeight(70);
		boolean msg2 = e.message;
		e.setStatus(26);
		boolean msg4 = e.message;

		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg2);
		
	}

}

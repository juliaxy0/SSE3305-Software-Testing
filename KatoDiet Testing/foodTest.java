import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import exercise.Food;

class KatoDietTest {
	
	@Test
	void test2() {
		
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("8:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Fish");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test1() {
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("8:30");
		boolean msg2 = f.message;
		f.setFoodcat("Mineral");
		boolean msg3 = f.message;
		f.setDesc("Water");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test3() {
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("8:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Nasi Lemak");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test4() {
		Food f = new Food();
		
		f.setBdate("16/5/2021");
		boolean msg1 = f.message;
		f.setTime("6:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fruit and Vegetable");
		boolean msg3 = f.message;
		f.setDesc("Nut");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test5() {
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("10:00");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Nasi Lemak Pakmusangi");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test6() {
		Food f = new Food();
		
		f.setBdate("20/12/2021");
		boolean msg1 = f.message;
		f.setTime("1:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Rice");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test7() {
		Food f = new Food();
		
		f.setBdate("20/12/2021");
		boolean msg1 = f.message;
		f.setTime("4:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fruit and Vegetable");
		boolean msg3 = f.message;
		f.setDesc("Nut");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test8() {
		Food f = new Food();
		
		f.setBdate("20/12/2021");
		boolean msg1 = f.message;
		f.setTime("9:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Wagyu");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test9() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("1:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Nasi Lemak Pakmusangi");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test10() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Kacang Gajus Kampung");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test11() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey Teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
	}
	
	@Test
	void test12() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg3);
	}
	
	@Test
	void test13() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
	}
	
	@Test
	void test14() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg3);
	}
	
	@Test
	void test15() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		
	}
	
	@Test
	void test16() {
		Food f = new Food();
		
		f.setBdate(null);
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test17() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Rice");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test18() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Fish");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test19() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fat");
		boolean msg3 = f.message;
		f.setDesc("Butter");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test20() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fruit and Vegetable");
		boolean msg3 = f.message;
		f.setDesc("Salad");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test21() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Mineral");
		boolean msg3 = f.message;
		f.setDesc("Water");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
}import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import exercise.Food;

class KatoDietTest {
	
	@Test
	void test2() {
		
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("8:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Fish");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test1() {
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("8:30");
		boolean msg2 = f.message;
		f.setFoodcat("Mineral");
		boolean msg3 = f.message;
		f.setDesc("Water");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test3() {
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("8:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Nasi Lemak");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test4() {
		Food f = new Food();
		
		f.setBdate("16/5/2021");
		boolean msg1 = f.message;
		f.setTime("6:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fruit and Vegetable");
		boolean msg3 = f.message;
		f.setDesc("Nut");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test5() {
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("10:00");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Nasi Lemak Pakmusangi");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test6() {
		Food f = new Food();
		
		f.setBdate("20/12/2021");
		boolean msg1 = f.message;
		f.setTime("1:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Rice");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test7() {
		Food f = new Food();
		
		f.setBdate("20/12/2021");
		boolean msg1 = f.message;
		f.setTime("4:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fruit and Vegetable");
		boolean msg3 = f.message;
		f.setDesc("Nut");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test8() {
		Food f = new Food();
		
		f.setBdate("20/12/2021");
		boolean msg1 = f.message;
		f.setTime("9:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Wagyu");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test9() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("1:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Nasi Lemak Pakmusangi");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test10() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Kacang Gajus Kampung");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test11() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey Teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
	}
	
	@Test
	void test12() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg3);
	}
	
	@Test
	void test13() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
	}
	
	@Test
	void test14() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg3);
	}
	
	@Test
	void test15() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		
	}
	
	@Test
	void test16() {
		Food f = new Food();
		
		f.setBdate(null);
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test17() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Rice");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test18() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Fish");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test19() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fat");
		boolean msg3 = f.message;
		f.setDesc("Butter");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test20() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fruit and Vegetable");
		boolean msg3 = f.message;
		f.setDesc("Salad");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test21() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Mineral");
		boolean msg3 = f.message;
		f.setDesc("Water");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
}import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import exercise.Food;

class KatoDietTest {
	
	@Test
	void test2() {
		
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("8:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Fish");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test1() {
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("8:30");
		boolean msg2 = f.message;
		f.setFoodcat("Mineral");
		boolean msg3 = f.message;
		f.setDesc("Water");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test3() {
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("8:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Nasi Lemak");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test4() {
		Food f = new Food();
		
		f.setBdate("16/5/2021");
		boolean msg1 = f.message;
		f.setTime("6:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fruit and Vegetable");
		boolean msg3 = f.message;
		f.setDesc("Nut");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test5() {
		Food f = new Food();
		
		f.setBdate("16/5/2020");
		boolean msg1 = f.message;
		f.setTime("10:00");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Nasi Lemak Pakmusangi");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test6() {
		Food f = new Food();
		
		f.setBdate("20/12/2021");
		boolean msg1 = f.message;
		f.setTime("1:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Rice");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test7() {
		Food f = new Food();
		
		f.setBdate("20/12/2021");
		boolean msg1 = f.message;
		f.setTime("4:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fruit and Vegetable");
		boolean msg3 = f.message;
		f.setDesc("Nut");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test8() {
		Food f = new Food();
		
		f.setBdate("20/12/2021");
		boolean msg1 = f.message;
		f.setTime("9:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Wagyu");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test9() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("1:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Nasi Lemak Pakmusangi");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test10() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Kacang Gajus Kampung");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		
	}
	
	@Test
	void test11() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey Teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
	}
	
	@Test
	void test12() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg3);
	}
	
	@Test
	void test13() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
	}
	
	@Test
	void test14() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		assertEquals(expectedOutput, msg3);
	}
	
	@Test
	void test15() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
		
	}
	
	@Test
	void test16() {
		Food f = new Food();
		
		f.setBdate(null);
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Char Kuey teow");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test17() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Carbohydrate");
		boolean msg3 = f.message;
		f.setDesc("Rice");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test18() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Protein");
		boolean msg3 = f.message;
		f.setDesc("Fish");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test19() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fat");
		boolean msg3 = f.message;
		f.setDesc("Butter");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test20() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Fruit and Vegetable");
		boolean msg3 = f.message;
		f.setDesc("Salad");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
	
	@Test
	void test21() {
		Food f = new Food();
		
		f.setBdate("10/9/2021");
		boolean msg1 = f.message;
		f.setTime("10:30");
		boolean msg2 = f.message;
		f.setFoodcat("Mineral");
		boolean msg3 = f.message;
		f.setDesc("Water");
		boolean msg4 = f.message;
		
		boolean expectedOutput = true;
		
		//assertEquals - reserve words for junit testing = to compare between expected and actual
		assertEquals(expectedOutput, msg2);
		assertEquals(expectedOutput, msg3);
		assertEquals(expectedOutput, msg4);
		assertEquals(expectedOutput, msg1);
	}
}

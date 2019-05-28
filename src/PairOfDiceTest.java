import	 static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class PairOfDiceTest {

	PairOfDice die1 = new PairOfDice();


//
//	@Test
//	public void test() {
//		int chance = PairOfDice.rollDice();
//		System.out.println(chance);
//		assertTrue(chance >= 1 && chance <= 6 );
//
//	}
//
//	@Test 
//	public void testDieRoll() {
//		int dieRoll = PairOfDice.roll();
//		System.out.println(dieRoll);
//		equals(dieRoll(0));
//
////	}
//
//	@Test
//	public void rollTotalWin() {
//		assertEquals(10, rollTotalLose(5 + 5));
//		assertEquals(7, rollTotalLose(2 + 5));
//	}
//
//	private Integer rollTotalWin(int i) {
//		// TODO Auto-generated method stub
//		return i ;
//	}
//
//
//	@Test
//	public void rollTotalLose() {
//		assertEquals(2, rollTotalLose(1 + 1));
//		assertEquals(3, rollTotalLose(2 + 1));
//		assertEquals(12, rollTotalLose(6 + 6));
//		
//	}
//
//	private Integer rollTotalLose(int i) {
//		// TODO Auto-generated method stub
//		return i ;
//	}
	
	
	@Test 
	public void pointTotal() {
		assertEquals(6, pointTotal(6 == 6)); 
		
	}


private Integer pointTotal(boolean b) {
	Integer pointtotal = null;
	// TODO Auto-generated method stub
	return pointtotal;
}
}



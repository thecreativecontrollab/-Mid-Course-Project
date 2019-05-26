import	 static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairOfDiceTest {

	@Test
	public void test() {
		int chance = PairOfDice.rollDice();
		System.out.println(chance);
		assertTrue(chance >= 1 && chance <= 6 );
		
	}



}


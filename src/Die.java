
public class Die {


	private static int dieRoll;

	public Die() 
	{
		// TODO Auto-generated constructor stub
		dieRoll = 0;
	}

	/** The roll Method rolls the six-sided die
	 * 
	 * 
	 * @return the value of the die roll, an integer 1-6.
	 */
	public static int roll() {
		dieRoll = (int) (Math.random() * 6) + 1;
		return dieRoll;
	}


	public static int rollDice() {
		// TODO Auto-generated method stub
		int die1 = (int) (Math.random()*6);
		return die1;


	}
}

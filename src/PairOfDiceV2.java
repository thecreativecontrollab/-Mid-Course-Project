import java.util.*;
/**
 *  Create a casino style game with a pair of dice and a player/shooter to roll
 * @authors 
 * Stephanie Tackett
 * Travis Crawford
 * version 1.0 
 *
 */
public class PairOfDice {


	private static int dieRoll;


	// Create objects for the game
	public static Die die1 = new Die();
	public static Die die2 = new Die();


	// constructor for game //
	public PairOfDice() 
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's play Fuzzy Dice!");
		startGame();

	}


	public static void startGame() {
		// Roll the dice for the first roll

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name to continue");
		String myname = input.nextLine();input.nextLine();
		System.out.println("Thank You,  " + myname);
		System.out.println("Press [Enter] to roll the dice: ");




		int roll1 = die1.roll();
		int roll2 = die2.roll();
		int rollTotal = roll1 + roll2;
		System.out.println("You rolled a " + roll1 + " and a " + roll2);
		System.out.println("for a total of " + rollTotal);
		//Find out if they won?
		if (rollTotal == 7 || rollTotal == 11)
		{
			System.out.println("You Won!");

		}

		//Find out if they lost?
		else if (rollTotal == 2 || rollTotal ==3 || rollTotal == 12) 
		{
			System.out.println("You lose!");
			System.out.println("Press [Enter] to play again");
			input.hasNextLine();
		}

		// If not win or lose, keep rolling to match the point.
		else 
		{
			int point = rollTotal;
			boolean keepPlaying = true;

			while(keepPlaying) {
				System.out.println("Roll Again: ");
				input.hasNextLine();


				// Did they win? (Match the point)
				if (rollTotal == point)
				{
					keepPlaying = false; // loop can stop now.
					System.out.println("You matched your point. " + myname + " You win!");
					System.out.println("Good Game " + myname);
					break;
				}
				// Did they lose? (Roll a 7)
				else if (rollTotal == 7);	
				System.out.println("You rolled a 7.  You lose! Are you shooting Craps in My House?" + myname);
				keepPlaying = false; // loop can stop now. 
			}
			System.out.println("Keep up the good work! ");
		}

		
	}
	// Create a loop


	public static void keepPlaying() {
		Scanner nextRound = new Scanner(System.in);
		int roll1 = die1.roll();
		int roll2 = die2.roll();
		int rollTotal = roll1 + roll2;
		System.out.println("You rolled a " + roll1 + " and a " + roll2);
		System.out.println("for a total of " + rollTotal);
		//Find out if they won?
		if (rollTotal == 7 || rollTotal == 11)
		{
			System.out.println("You Won!");

		}

		//Find out if they lost?
		else if (rollTotal == 2 || rollTotal ==3 || rollTotal == 12) 
		{
			System.out.println("You lose!");
			System.out.println("Press [Enter] to play again");
			nextRound.hasNextLine();
		}

		// If not win or lose, keep rolling to match the point.
		else 
		{
			int point = rollTotal;
			boolean keepPlaying = true;

			
			while(keepPlaying) {
				System.out.println("Roll Again: ");
				nextRound.nextLine();



				// Did they win? (Match the point)
				if (rollTotal == point)
				{
					System.out.println("You matched your point. " + " You win!");
					
					keepPlaying = false; // loop can stop now.

					System.out.println("Good Game! ");
					
				
				
					


				}
				// Did they lose? (Roll a 7)
				else if (rollTotal == 7);	
			}
		
			keepPlaying = false; // loop can stop now. 
		}
	}
}

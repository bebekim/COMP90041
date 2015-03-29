
/*
- Done - 
   display a welcome message
   Accept name of Player 1 in string (no space)
   Accept name of Player 2 in string (no space)
   Accept upperbound - class variable
   Accept initial number of stones
   
- To Do List -
   Print initial number of stones in asterisks *
   Game starts,
   Player 1 removes x < upperbound+1 stones
   Prove updated number and display of stones
   Player 2 removes y < upperbound+1 stones
   Repeat previous two steps until no more stones are left behind.
   Display 'Game Over'
   println("name of the winner");
   Terminate program.
*/

import java.util.Scanner;

public class Nimsys {	
	public static Scanner input = new Scanner (System.in);
	//upperBound and stoneCount are game rules so they stay within Nisys
	public static int upperBound;
	public static int stoneCount;
	
	public static void main (String[] args) {
		System.out.println("Welcome to Nim");

		System.out.println("Please enter Player 1's name:");
		Nimplayer player1 = Nimplayer.createPlayer();
		player1.setName(Nimsys.acceptName());

		System.out.println("Please enter Player 2's name:");
		Nimplayer player2 = Nimplayer.createPlayer();
		player2.setName(Nimsys.acceptName());

		//game set up
		Nimsys.setUpperBound();
		Nimsys.setStone();
		
		//game play begin
		Nimsys.displayControl(stoneCount);
	}

	//similar in nature with createPlayer() method
	public static String acceptName () {
		return input.next();
	}

	public static void setUpperBound () {
		System.out.println("Please enter upper bound of stone removal:");
		upperBound = input.nextInt();
	}

	public static void setStone () {
		System.out.println("Please enter initial number of stones:");
		stoneCount = input.nextInt();
	}


	public static void displayControl (int stoneCount) {
		int asterisks = stoneCount;
		displayAsterisks(asterisks);
	}

	private static void displayAsterisks (int asterisks) {
		System.out.print("*");
		if (asterisks == 1) {
			;
		}
		else {
			System.out.print(" ");
			asterisks--;
			displayAsterisks(asterisks);
		}
	}

	private void gameOver (String winner) {
		System.out.println("Game Over");
		System.out.println(winner + "wins");
	}

}


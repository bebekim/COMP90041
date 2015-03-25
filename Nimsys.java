
/*
- To Do List -
   display a welcome message
   Accept name of Player 1 in string (no space)
   Accept name of Player 2 in string (no space)
   Accept upperbound - class variable
   Accept initial number of stones
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
	// to prevent using more than Scanner object, final is used.
	public static final Scanner input = new Scanner (System.in);
	private static int upperBound;

	public static void main (String[] args) {
		System.out.println("Welcome to Nim");
				
		System.out.println("Please enter Player 1's name:");
		Nimplayer player1 = Nimplayer.createPlayer();
		player1.getName();

		System.out.println("Please enter Player 2's name:");
		Nimplayer player2 = Nimplayer.createPlayer();
		player2.getName();

		Nimsys.getUpperBound(input);
	}

	private static void getUpperBound(Scanner input) {
		System.out.println("Please enter upper bound of stone removal:");
		upperBound = input.nextInt();
	}
}


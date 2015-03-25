
/*
- To Do List -
   display a welcome message
   Accept name of Player 1 in string (no space)
   Accept name of Player 2 in string (no space)
   Accept upperbound
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
	public static void main (String[] args) {
		System.out.println("Welcome to Nim");
		
		// only ONE scanner in main method
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter Player 1's name");
		Nimplayer player1 = new Nimplayer(input);
		player1.getName();

		System.out.println("Please enter Player 2's name");
		Nimplayer player2 = new Nimplayer(input);
		player2.getName();
		
	}
}


/*
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
		System.out.println("\nWelcome to Nim\n");
		Scanner input = new Scanner (System.in);

		Nimplayer player1 = new Nimplayer();
		Nimplayer player2 = new Nimplayer();

		System.out.println("Please enter Player 1's name");
		player1.name = input.nextLine();

		System.out.println("Please enter Player 2's name");
		player2.name = input.nextLine();
	}
}
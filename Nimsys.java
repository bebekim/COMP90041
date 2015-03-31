/*
Name: Young Ha Kim
Email: younghak@student.unimelb.edu.au
Class: COMP90041 
Assignment: Project A - Game of Nim
Assignment Requirements:

- Done - 
   display a welcome message
   Accept name of Player 1 in string (no space)
   Accept name of Player 2 in string (no space)
   Accept upperbound - class variable
   Accept initial number of stones
   Print initial number of stones in asterisks *
- To Do List -
   Player 1 turn,
   Player 1 removes x < upperbound+1 stones
   Show updated number and display of stones
   Player 2 turn,
   Player 2 removes y < upperbound+1 stones
   Repeat previous 5 steps until no more stones are left behind.
   Display 'Game Over'
   Print the name of the winner.
   Terminate program.
*/

import java.util.Scanner;

public class Nimsys {	
	public static Scanner input = new Scanner (System.in);
	public static int upperBound;
	public static int stoneCount;
	public static boolean isPlayer1Turn = true;
	
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
		while (stoneCount > 0) {
			Nimsys.displayControl(stoneCount);
/*
			if (isPlayer1Turn == true) {
				System.out.println(player1.name + "'s turn - remove how many?");

			}
			else {
				System.out.println(player2.name + "'s turn - remove how many?");
			}
*/
			stoneCount--;
		} 

	}

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
		if (asterisks == 1) {
			System.out.print("*\n");
		}
		else {
			System.out.print("* ");
			asterisks--;
			displayAsterisks(asterisks);
		}
	}

}


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
	// to prevent using more than Scanner object, final is used.
	public static Scanner input = new Scanner (System.in);
	private static int upperBound;
	private static int stoneCount;

	public static void main (String[] args) {
		System.out.println("Welcome to Nim");

		System.out.println("Please enter Player 1's name:");
		Nimplayer player1 = Nimplayer.createPlayer();
		player1.setName(Nimsys.setName());

		System.out.println("Please enter Player 2's name:");
		Nimplayer player2 = Nimplayer.createPlayer();
		player2.setName(Nimsys.setName());

		Nimsys.setUpperBound();
		Nimsys.setStone();
	}

	/*
	On the choice of using
	public static void setUpperBound()
	vs.
	private static void setUpperBound(Scanner input)
	I have chosen to use public static void with no parameter. 
	Why? because with only one Scanner object,
	it serves many purposes and doesn't seem like a unique input parameter.
	*/

	public static String setName() {
		return input.next();
	}

	public static void setUpperBound() {
		System.out.println("Please enter upper bound of stone removal:");
		upperBound = input.nextInt();
	}

	public static void setStone() {
		System.out.println("Please enter initial number of stones:");
		stoneCount = input.nextInt();
	}



}


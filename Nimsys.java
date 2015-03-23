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

// http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
// http://www.cs.utexas.edu/users/ndale/Scanner.html
import java.util.Scanner;

public class Nimsys {
   public static void main(String[]args) {
      System.out.println("\nWelcome to Nim\n");
   }

}

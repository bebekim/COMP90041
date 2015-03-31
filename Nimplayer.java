import java.util.Scanner;

public class Nimplayer {
	private String name;


	//constructor which plainly replaces default 'new' to make it look easier on the eye.
	public static Nimplayer createPlayer() {
		return new Nimplayer();
	}

	public void setName(String name) {
		this.name = name;
	}

/*
	public int removeStone (boolean isPlayer1Turn) {
		if (isPlayer1Turn == true) {
			System.out.println(player1.name + "'s turn - remove how many?");
		}
		else {
			System.out.println(player2.name + "'s turn - remove how many?");
		}
		return input.nextInt();
	}

*/
}
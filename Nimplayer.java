import java.util.Scanner;

public class Nimplayer {
	private Scanner keyboard;
	private String name;
	private static int upperBound;

	//constructor which passes Scanner object from main
	public Nimplayer(Scanner input) {
		this.keyboard = input;
	}

	public void getName() {
		name = keyboard.nextLine();
	}

	public static int getUpperBound() {
		System.out.println("Please enter upper bound of stone removal:");
		return keyboard.nextInt();
	}
/*
	public int removeStone() {
		keyboard.nextInt();
		return 0;
		//action takes place
	}
*/

}
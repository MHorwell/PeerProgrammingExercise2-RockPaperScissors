package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Main {
	int points;
	int computerPoints = -points;
	int playerWins = 0;
	int playerLosses = 0;
	int computerWins = 0;
	int computerLosses = 0;
	int gamesPlayed = 0;
	String cont = "y";
	
	public static void main(String[] args) {
	}
	
	public void game() {
		while (cont.equals("y")) {
			Random randomInt = new Random();
			String computerWeapon = new String();
			int weaponchoice = randomInt.nextInt(3);
			if (weaponchoice == 1) {
				computerWeapon = "r";
			}
			if (weaponchoice == 2) {
				computerWeapon = "p";
			}
			if (weaponchoice == 3) {
				computerWeapon = "s";
			}
			Scanner userInput = new Scanner(System.in);
			System.out.println("What is your weapon? (r, p or s)");
			String selectedWeapon = userInput.nextLine();
			fight(selectedWeapon, computerWeapon);
			
			
			System.out.println("Would you like to continue? (y  or  n)");
			cont = userInput.nextLine();
		}
	}

	public int fight(String selectedWeapon, String computerWeapon) {

		if (selectedWeapon.equals(computerWeapon)) {
			System.out.println("It's a tie!");
		}
		if (selectedWeapon.equals("s") && computerWeapon.equals("p")) {
			points = points + 1;
			playerWinsRound();
		}
		if (selectedWeapon.equals("s") && computerWeapon.equals("r")) {
			points = points - 1;
			playerLosesRound();
		}
		if (selectedWeapon.equals("p") && computerWeapon.equals("r")) {
			points = points + 1;
			playerWinsRound();
		}
		if (selectedWeapon.equals("p") && computerWeapon.equals("s")) {
			points = points - 1;
			playerLosesRound();
		}
		if (selectedWeapon.equals("r") && computerWeapon.equals("s")) {
			points = points + 1;
			playerWinsRound();
		}
		if (selectedWeapon.equals("r") && computerWeapon.equals("p")) {
			points = points - 1;
			playerLosesRound();
		}
		
		gamesPlayed ++;
		return points;
	}

	public int getPoints() {
		
		return points;
	}
	
	public void playerWinsRound() {
		playerWins += 1;
		computerLosses +=1;
		System.out.println("You win!");
	}
	
	public void playerLosesRound() {
		playerLosses += 1;
		computerWins += 1;
		System.out.println("You lose!");
	}

}

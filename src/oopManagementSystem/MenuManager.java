package oopManagementSystem;

import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		MusicManager musicmanager = new MusicManager(input);
		while (num != 5) {
			System.out.println("1. Add Music");
			System.out.println("2. Delete Music");
			System.out.println("3. Edit Music");
			System.out.println("4. Play Music");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1~5 : ");
			num = input.nextInt();
			switch(num) {
				case 1:
					musicmanager.addMusic();
					break;
				case 2:
					musicmanager.deleteMusic();
					break;
				case 3:
					musicmanager.editMusic();
					break;
				case 4:
					musicmanager.playMusic();
					break;
				case 5:	
					break;
			}
			
		}

	}
	
	
}

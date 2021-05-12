package oopManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MusicManager musicmanager = new MusicManager(input);
		selectMenu(input, musicmanager);
	}

	
	public static void selectMenu(Scanner input, MusicManager musicmanager) {
		int num = 0;
		while (num != 5) {
			try {
				showMenu();
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
						musicmanager.viewMusics();
						break;
					case 6:	
						break;
					default :
						continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer 1~6");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	

	public static void showMenu() {
		System.out.println("1. Add Music");
		System.out.println("2. Delete Music");
		System.out.println("3. Edit Music");
		System.out.println("4. Play Music");
		System.out.println("5. View Musics");
		System.out.println("6. Exit");
		System.out.print("Select one number between 1~6 : ");
	}
}

package oopManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add Music");
			System.out.println("2. Delete Music");
			System.out.println("3. Edit Music");
			System.out.println("4. Play Music");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1~6 : ");
			num = input.nextInt();
			switch(num) {
				case 1:
					addMusic();
					break;
				case 2:
					deleteMusic();
					break;
				case 3:
					editMusic();
					break;
				case 4:
					playMusic();
					break;
				case 5:
					//show menu
				case 6:	
					break;
			}
			
		}

	}
	public static void addMusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of Music : ");
		int number = input.nextInt();
		System.out.print("Title of Music : ");
		String title = input.next();
		System.out.print("Artist : ");
		String artist = input.next();
	}
	
	public static void deleteMusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Which Music you want to delete? Write Title of Music : ");
		String d_title = input.next();
		System.out.println(d_title + "is deleted.");
	}
	
	public static void editMusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Which Music you want to edit? Write Title of Music : ");
		String e_title = input.next();
		System.out.println(e_title + "is edited.");
	}
	
	public static void playMusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Which Music you want to play? Write Title of Music : ");
		String p_title = input.next();
		System.out.println("Now " + p_title + " is playing.");
		
	}
	
}

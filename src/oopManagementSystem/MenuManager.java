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
			System.out.println("4. View Music");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1~6 : ");
			num = input.nextInt();
			switch(num) {
				case 1:
					System.out.print("Title of Music : ");
					String title = input.next();
					System.out.print("Artisit : ");
					String artisit = input.next();
					break;
				case 2:
					
				case 3:
					
				case 4:
					
				case 5:
					
				case 6:	
					break;
			}
			
		}
	}

}

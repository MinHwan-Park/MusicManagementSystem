package Music;

import java.util.Scanner;

public class RockMusic extends Music {
	
	public RockMusic(MusicKind kind) {
		super(kind);
	}
	
	public void getMusicInput(Scanner input) {
		System.out.print("Number of Music : ");
		int number = input.nextInt();
		this.setNumber(number);
		System.out.print("Title of Music : ");
		String title = input.next();
		this.setTitle(title);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Did it has Artist? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Artist : ");
				String artist = input.next();
				this.setArtist(artist);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setArtist("");
				break;
			}
			else {
			}
		}
	}

}

package Music;

import java.util.Scanner;

public class HiphopMusic extends Music implements MusicInput {
	
	public HiphopMusic(MusicKind kind) {
		super(kind);
	}
	
	protected String originalArtist;
	
	public void getMusicInput(Scanner input) {
		System.out.print("Number of Music : ");
		int number = input.nextInt();
		this.setNumber(number);
		System.out.print("Title of Music : ");
		String title = input.next();
		this.setTitle(title);
		
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Did it has Arranger? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Arranger : ");
				String arranger = input.next();
				this.setArranger(arranger);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setArranger("");
				break;
			}
			else {
			}
		}
		
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Did it has Original Artist? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Original Artist : ");
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
	
	public void printInfo() {
		String mkind = "none";
		switch(this.kind) {
		case Pop:
			mkind = "Pop";
			break;
		case Rock:
			mkind = "Rock";
			break;
		case Ballad:
			mkind = "Ballad";
			break;
		case Hiphop:
			mkind = "Hiphop";
			break;
		default:
			
		}
		System.out.println("Kind : " + mkind + "Number of Music : " + number + " Title of Music : " + title + "Arranger : " + arranger + "Original Artist : " + artist);
	}
}

package Music;

import java.util.Scanner;

public class BalladMusic extends Music {
	
	protected String album;
	
	public BalladMusic(MusicKind kind) {
		super(kind);
	}
	
	public void getMusicInput(Scanner input) {
		System.out.print("Number of Music : ");
		int number = input.nextInt();
		this.setNumber(number);
		System.out.print("Title of Music : ");
		String title = input.next();
		this.setTitle(title);
		System.out.print("Artist : ");
		String artist = input.next();
		this.setArtist(artist);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Did it has Album? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Artist : ");
				String album = input.next();
				this.setArranger(album);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setArranger("");
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
		System.out.println("Kind : " + mkind + "Number of Music : " + number + " Title of Music : " + title + "Album : " + arranger + "Artist : " + artist);
	}
	
}

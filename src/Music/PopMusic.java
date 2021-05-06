package Music;

import java.util.Scanner;

public class PopMusic extends Music implements MusicInput {
	
	public PopMusic(MusicKind kind) {
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
		System.out.print("Arranger : ");
		String arranger = input.next();
		this.setArranger(arranger);
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
		System.out.println("Kind : " + mkind + "Number of Music : " + number + " Title of Music : " + title + " Artist : " + artist + "Arranger : " + arranger);
	}

}

package Music;

import java.util.Scanner;

import exceptions.ArtistFormatException;

public abstract class HardMusic extends Music {

	public HardMusic(MusicKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getMusicInput(Scanner input);

	@Override
	public void printInfo() {
		String mkind = getKindString();
		System.out.println("Kind : " + mkind + " Number of Music : " + number + " Title of Music : " + title + " Arranger : " + arranger + " Artist : " + artist);
	}
	
	public void setMusicArtistYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Did it has Artist? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setMusicArtist(input);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setArtist("");
					break;
				}
				else {
				}
			} 
			catch(ArtistFormatException e) {
				System.out.println("Incorrect Artist Format. Put Artist's name that not contains .");
			}
				
		}
	}
	
	public void setMusicArrangerYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Did it has Arranger? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setMusicArranger(input);
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
	
	public void setMusicOriginalArtistYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Did it has Original Artist? (Y/N)");
			answer = input.next().charAt(0);
			try {
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
			catch(ArtistFormatException e) {
				System.out.println("Incorrect Artist Format. Put Artist's name that not contains .");
			}
			
		}
	}
}

package Music;

import java.util.Scanner;

import exceptions.ArtistFormatException;

public abstract class Music implements MusicInput{
	protected MusicKind kind = MusicKind.Pop;
	protected int number;
	protected String title;
	protected String artist;
	protected String arranger;
	
	public Music() {
	}
	
	public Music(MusicKind kind) {
		this.kind = kind;
	}

	public Music(int number, String title, String artist) {
		this.number = number;
		this.title = title;
		this.artist = artist;
	}
	
	public Music(int number, String title, String artist, String arranger) {
		this.number = number;
		this.title = title;
		this.artist = artist;
		this.arranger = arranger;
	}
	
	public MusicKind getKind() {
		return kind;
	}

	public void setKind(MusicKind kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) throws ArtistFormatException {
		if(!artist.contains(".") && !artist.equals("")) {
			throw new ArtistFormatException();
		}
		this.artist = artist;
	}
	
	public String getArranger() {
		return arranger;
	}

	public void setArranger(String arranger) {
		this.arranger = arranger;
	}
	 
	public abstract void printInfo();

	
	public void setMusicNumber(Scanner input) {
		System.out.print("Music Number : ");
		int number = input.nextInt();
		this.setNumber(number);
	}
	
	public void setMusicTitle(Scanner input) {
		System.out.print("Music Title : ");
		String title = input.next();
		this.setTitle(title);
	}
	
	public void setMusicArtist(Scanner input) {
		String artist = "";
		while (!artist.contains(".")) {
			System.out.print("Music Artist : ");
			artist = input.next();
			try {
				this.setArtist(artist);
			} catch(ArtistFormatException e) {
				System.out.println("Incorrect Artist Format. Put Artist's name that not contains .");
			}
		}
	}
	
	public void setMusicArranger(Scanner input) {
		System.out.print("Arranger : ");
		String arranger = input.next();
		this.setArranger(arranger);
	}
	
	public String getKindString() {
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
		return mkind;
	}
}

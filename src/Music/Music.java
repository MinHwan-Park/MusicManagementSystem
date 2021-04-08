package Music;

import java.util.Scanner;

public class Music {
	protected MusicKind kind = MusicKind.Pop;
	protected int number;
	protected String title;
	protected String artist;
	
	public Music() {
	}

	public Music(int number, String title, String artist) {
		this.number = number;
		this.title = title;
		this.artist = artist;
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

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void printInfo() {
		System.out.println("Number of Music : " + number + " Title of Music : " + title + " Artist : " + artist);
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
	}

}

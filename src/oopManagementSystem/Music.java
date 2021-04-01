package oopManagementSystem;

public class Music {
	int number;
	String title;
	String artist;

	public Music(int number, String title, String artist) {
		this.number = number;
		this.title = title;
		this.artist = artist;
	}
	
	public Music() {
	}
	
	public void printInfo() {
		System.out.println("Number of Music : " + number + "Title of Music : " + title + "Artist : " + artist);
	}

}

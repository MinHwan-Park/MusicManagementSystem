package Music;

import java.util.Scanner;

import exceptions.ArtistFormatException;

public interface MusicInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setTitle(String title);
	
	public void setArtist(String artist) throws ArtistFormatException;
	
	public void getMusicInput(Scanner input);

	public void printInfo();
	
	public void setMusicNumber(Scanner input);
	
	public void setMusicTitle(Scanner input);
	
	public void setMusicArtist(Scanner input);
	
	public void setMusicArranger(Scanner input);
	
}

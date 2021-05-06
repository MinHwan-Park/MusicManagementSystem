package Music;

import java.util.Scanner;

public interface MusicInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setTitle(String title);
	
	public void setArtist(String artist);
	
	public void getMusicInput(Scanner input);

	public void printInfo();
	
}

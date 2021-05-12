package Music;

import java.util.Scanner;

public class PopMusic extends SoftMusic{
	
	public PopMusic(MusicKind kind) {
		super(kind);
	}
	
	public void getMusicInput(Scanner input) {
		setMusicNumber(input);
		setMusicTitle(input);
		setMusicArtist(input);
		setMusicArranger(input);
	}
}

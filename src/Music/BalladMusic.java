package Music;

import java.util.Scanner;

public class BalladMusic extends SoftMusic{
	
	public BalladMusic(MusicKind kind) {
		super(kind);
	}
	
	public void getMusicInput(Scanner input) {
		setMusicNumber(input);
		setMusicTitle(input);
		setMusicArtist(input);
	}
	
}

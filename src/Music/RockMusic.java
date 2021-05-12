package Music;

import java.util.Scanner;

public class RockMusic extends HardMusic{
	
	public RockMusic(MusicKind kind) {
		super(kind);
	}
	
	public void getMusicInput(Scanner input) {
		setMusicNumber(input);
		setMusicTitle(input);
		setMusicArtistYN(input);
	}
}

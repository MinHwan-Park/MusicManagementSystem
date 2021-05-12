package Music;

import java.util.Scanner;

public class HiphopMusic extends HardMusic{
	
	public HiphopMusic(MusicKind kind) {
		super(kind);
	}
	
	protected String originalArtist;
	
	public void getMusicInput(Scanner input) {
		setMusicNumber(input);
		setMusicTitle(input);
		setMusicArrangerYN(input);
		setMusicOriginalArtistYN(input);
	}
}

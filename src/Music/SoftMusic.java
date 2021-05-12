package Music;

import java.util.Scanner;

public abstract class SoftMusic extends Music {

	public SoftMusic(MusicKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getMusicInput(Scanner input);

	@Override
	public void printInfo() {
		String mkind = getKindString();
		System.out.println("Kind : " + mkind + " Number of Music : " + number + " Title of Music : " + title + " Arranger : " + arranger + " Artist : " + artist);
	}
	
}

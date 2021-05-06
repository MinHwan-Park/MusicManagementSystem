package Music;

public abstract class Music {
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

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArranger() {
		return arranger;
	}

	public void setArranger(String arranger) {
		this.arranger = arranger;
	}
	 
	public abstract void printInfo();

}

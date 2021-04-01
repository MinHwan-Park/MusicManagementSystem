package oopManagementSystem;

import java.util.Scanner;

public class MusicManager {
	Music music;
	Scanner input;
	MusicManager(Scanner input){
		this.input = input;
	}
	
	public void addMusic() {
		music = new Music();
		System.out.print("Number of Music : ");
		music.number = input.nextInt();
		System.out.print("Title of Music : ");
		music.title = input.next();
		System.out.print("Artist : ");
		music.artist = input.next();
	}
	
	public void deleteMusic() {
		System.out.print("Which Music you want to delete? Write Title of Music : ");
		String d_title = input.next();
		if(music == null) {
			System.out.println(d_title + " has not been registered.");
			return;
		}
		if(d_title == music.title) {
			music = null;
			System.out.println(d_title + " is deleted.");
		}
	}
	
	public void editMusic() {
		System.out.print("Which Music you want to edit? Write Title of Music : ");
		String e_title = input.next();
		if(e_title == music.title) {
			music = null;
			System.out.println(e_title + "is edited.");
		}
	}
	
	public void playMusic() {
		System.out.print("Which Music you want to play? Write Title of Music : ");
		String p_title = input.next();
		if(p_title == music.title) {
			music = null;
			System.out.println("Now " + p_title + " is playing.");
		}
		
	}

}

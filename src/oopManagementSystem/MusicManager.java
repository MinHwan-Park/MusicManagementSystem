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
		System.out.print("Which Music you want to delete? Write Number of Music : ");
		int number = input.nextInt();
		if(music == null) {
			System.out.println("The music has not been registered.");
			return;
		}
		if(number == music.number) {
			music = null;
			System.out.println("The music is deleted.");
		}
	}
	
	public void editMusic() {
		System.out.print("Which Music you want to edit? Write Number of Music : ");
		int number = input.nextInt();
		if(music == null) {
			System.out.println("The music has not been registered.");
			return;
		}
		if(number == music.number) {
			music = null;
			System.out.println("The music is edited.");
		}
	}
	
	public void playMusic() {
		System.out.print("Which Music you want to play? Write Number of Music : ");
		int number = input.nextInt();
		if(music == null) {
			System.out.println("The music has not been registered.");
			return;
		}
		if(number == music.number) {
			music = null;
			System.out.println("Now the music is playing.");
		}
		
	}
	
	public void viewMusic() {
		System.out.print("Which Music you want to view? Write Number of Music : ");
		int number = input.nextInt();
		if(number == music.number) {
			music.printInfo();
		}
		
	}

}

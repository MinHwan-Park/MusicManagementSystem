package oopManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

import Music.Music;
import Music.RockMusic;

public class MusicManager {
	ArrayList<Music> musics = new ArrayList<Music>();
	Scanner input;
	MusicManager(Scanner input){
		this.input = input;
	}
	
	public void addMusic() {
		int kind = -1;
		Music music;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			System.out.println("1. Pop");
			System.out.println("2. Rock");
			System.out.println("3. Ballad");
			System.out.println("4. Rap");
			System.out.print("Select Music Kind : ");
			kind = input.nextInt();
			if (kind == 1) {
				music = new Music();
				music.getMusicInput(input);
				musics.add(music);
				break;
			}
			
			else if (kind == 2) {
				music = new RockMusic();
				music.getMusicInput(input);
				musics.add(music);
				break;
			}
			
			else if (kind == 3) {
				music = new Music();
				music.getMusicInput(input);
				musics.add(music);
				break;
			}
			
			else if (kind == 4) {
				music = new Music();
				music.getMusicInput(input);
				musics.add(music);
				break;
			}
			
			else {
				System.out.print("Select Music Kind between 1 ~ 4: ");
			}
		}
	}
	
	public void deleteMusic() {
		System.out.print("Which Music you want to delete? Write Number of Music : ");
		int number = input.nextInt();
		int index = -1;
		for(int i = 0; i<musics.size(); i++) {
			if(number == musics.get(i).getNumber()) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			musics.remove(index);
			System.out.println("The music " + number + " is deleted.");
		}
		else {
			System.out.println("The music has not been registered.");
			return;
		}
	}
	
	public void editMusic() {
		System.out.print("Which Music you want to edit? Write Number of Music : ");
		int musicNumber = input.nextInt();
		for(int i = 0; i<musics.size(); i++) {
			Music music = musics.get(i);
			if(musicNumber == music.getNumber()) {
				int num = -1;
				while(num != 4) {
					System.out.println("==Edit Menu==");
					System.out.println("1. Edit Number");
					System.out.println("2. Edit Title");
					System.out.println("3. Edit Artist");
					System.out.println("4. Exit");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Music Number : ");
						int number = input.nextInt();
						music.setNumber(number);
					}
					else if (num == 2) {
						System.out.print("Music Title : ");
						String title = input.next();
						music.setTitle(title);
					}
					else if (num == 3) {
						System.out.print("Music Artist : ");
						String artist = input.next();
						music.setArtist(artist);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void playMusic() {
		System.out.print("Which Music you want to play? Write Number of Music : ");
		int number = input.nextInt();
		int index = -1;
		for(int i = 0; i<musics.size(); i++) {
			if(number == musics.get(i).getNumber()) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			System.out.println("Now the music " + number + " is playing.");
		}
		else {
			System.out.println("The music has not been registered.");
			return;
		}	
	}
	
	public void viewMusics() {
		System.out.println("Total registered Music : " + musics.size());
		for(int i = 0; i<musics.size(); i++) {
			musics.get(i).printInfo();
		}
	}

}

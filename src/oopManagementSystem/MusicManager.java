package oopManagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Music.BalladMusic;
import Music.HiphopMusic;
import Music.MusicInput;
import Music.MusicKind;
import Music.PopMusic;
import Music.RockMusic;

public class MusicManager {
	ArrayList<MusicInput> musics = new ArrayList<MusicInput>();
	Scanner input;
	MusicManager(Scanner input){
		this.input = input;
	}
	
	
	public void addMusic() {
		int kind = -1;
		MusicInput musicInput;
		while (kind < 1 || kind > 4) {
			try {
				System.out.println("1. Pop");
				System.out.println("2. Rock");
				System.out.println("3. Ballad");
				System.out.println("4. Hiphop");
				System.out.print("Select num 1~4 for Music Kind : ");
				kind = input.nextInt();
				if (kind == 1) {
					musicInput = new PopMusic(MusicKind.Pop);
					musicInput.getMusicInput(input);
					musics.add(musicInput);
					break;
				}
				
				else if (kind == 2) {
					musicInput = new RockMusic(MusicKind.Rock);
					musicInput.getMusicInput(input);
					musics.add(musicInput);
					break;
				}
				
				else if (kind == 3) {
					musicInput = new BalladMusic(MusicKind.Ballad);
					musicInput.getMusicInput(input);
					musics.add(musicInput);
					break;
				}
				
				else if (kind == 4) {
					musicInput = new HiphopMusic(MusicKind.Hiphop);
					musicInput.getMusicInput(input);
					musics.add(musicInput);
					break;
				}
				
				else {
					System.out.print("Select Music Kind between 1 ~ 4: ");
				}
		}
		catch(InputMismatchException e) {
			System.out.println("Please put an integer 1~4");
			if (input.hasNext()) {
				input.next();
			}
			kind = -1;
		}
		}
	}


	public void deleteMusic() {
		System.out.print("Which Music you want to delete? Write Number of Music : ");
		int number = input.nextInt();
		int index = findIndex(number);
		removefromMusic(index, number);
	}
	
	public int findIndex(int number) {
		int index = -1;
		for(int i = 0; i<musics.size(); i++) {
			if(number == musics.get(i).getNumber()) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromMusic(int index, int number) {
		if(index >= 0) {
			musics.remove(index);
			System.out.println("The music " + number + " is deleted.");
			return 1;
		}
		else {
			System.out.println("The music has not been registered.");
			return -1;
		}
	}
	
	public void editMusic() {
		System.out.print("Which Music you want to edit? Write Number of Music : ");
		int musicNumber = input.nextInt();
		for(int i = 0; i<musics.size(); i++) {
			MusicInput music = musics.get(i);
			if(musicNumber == music.getNumber()) {
				int num = -1;
				while(num != 4) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						music.setMusicNumber(input);
						break;
					case 2:
						music.setMusicTitle(input);
						break;
					case 3:
						music.setMusicArtist(input);
						break;
					default:
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
	
	public void showEditMenu() {
		System.out.println("==Edit Menu==");
		System.out.println("1. Edit Number");
		System.out.println("2. Edit Title");
		System.out.println("3. Edit Artist");
		System.out.println("4. Exit");
	}

}

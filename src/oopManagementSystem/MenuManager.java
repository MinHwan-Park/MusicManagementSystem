package oopManagementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import GUI.WindowFrame;
import Log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MusicManager musicmanager = getObject("musicmanager.ser");
		if (musicmanager == null) {
			musicmanager = new MusicManager(input);
		}
		
		WindowFrame frame = new WindowFrame(musicmanager);
		selectMenu(input, musicmanager);
		putObject(musicmanager, "musicmanager.ser");
	}

	public static void selectMenu(Scanner input, MusicManager musicmanager) {
		int num = 0;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
					case 1:
						musicmanager.addMusic();
						logger.log("add a music");
						break;
					case 2:
						musicmanager.deleteMusic();
						logger.log("delete a music");
						break;
					case 3:
						musicmanager.editMusic();
						logger.log("edit a music");
						break;
					case 4:
						musicmanager.playMusic();
						logger.log("play a music");
						break;
					case 5:
						musicmanager.viewMusics();
						logger.log("view a music");
						break;
					case 6:	
						break;
					default :
						continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer 1~6");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	

	public static void showMenu() {
		System.out.println("1. Add Music");
		System.out.println("2. Delete Music");
		System.out.println("3. Edit Music");
		System.out.println("4. Play Music");
		System.out.println("5. View Musics");
		System.out.println("6. Exit");
		System.out.print("Select one number between 1~6 : ");
	}
	
	public static MusicManager getObject(String filename) {
		MusicManager musicmanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			musicmanager = (MusicManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return musicmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return musicmanager;
		
	}
	
	public static void putObject(MusicManager musicmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(musicmanager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

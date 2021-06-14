package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Music.MusicInput;
import Music.MusicKind;
import Music.PopMusic;
import exceptions.ArtistFormatException;
import oopManagementSystem.MusicManager;

public class MusicAdderListener implements ActionListener {

	JTextField fieldNumber;
	JTextField fieldTitle;
	JTextField fieldArtist;
	JTextField fieldArranger;

	MusicManager musicmanager;
	
	public MusicAdderListener(JTextField fieldNumber, 
			JTextField fieldTitle, JTextField fieldArtist,
			JTextField fieldArranger, MusicManager musicmanager) {
		this.fieldNumber = fieldNumber;
		this.fieldTitle = fieldTitle;
		this.fieldArtist = fieldArtist;
		this.fieldArranger = fieldArranger;
		this.musicmanager = musicmanager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		MusicInput music = new PopMusic(MusicKind.Pop);
		try {
			music.setNumber(Integer.parseInt(fieldNumber.getText()));
			music.setTitle(fieldTitle.getText());
			music.setArtist(fieldArtist.getText());
			music.setArranger(fieldArranger.getText());
			musicmanager.addMusic(music);
			putObject(musicmanager, "musicmanager.ser");
			music.printInfo();
		} catch (ArtistFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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

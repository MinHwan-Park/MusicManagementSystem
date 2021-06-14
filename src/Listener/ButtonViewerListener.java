package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.MusicViewer;
import GUI.WindowFrame;
import oopManagementSystem.MusicManager;

public class ButtonViewerListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewerListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MusicManager musicmanager = getObject("musicmanager.ser");
		MusicViewer viewer = frame.getMusicviewer();
		viewer.setMusicmanager(musicmanager);
		
		JButton b = (JButton)e.getSource();
		frame.setupPanel(viewer);
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
}

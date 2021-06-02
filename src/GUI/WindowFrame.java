package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import oopManagementSystem.MusicManager;

public class WindowFrame extends JFrame {
	MusicManager musicmanager;
	MenuSelection menuselection;
	MusicAdder musicadder;
	MusicViewer musicviewer;
	
	public WindowFrame(MusicManager musicmanager) {
		this.musicmanager = musicmanager;
		this.menuselection = new MenuSelection(this);
		this.musicadder = new MusicAdder(this, this.musicmanager);
		this.musicviewer = new MusicViewer(this, this.musicmanager);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(menuselection);
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public MusicAdder getMusicadder() {
		return musicadder;
	}

	public void setMusicadder(MusicAdder musicadder) {
		this.musicadder = musicadder;
	}

	public MusicViewer getMusicviewer() {
		return musicviewer;
	}

	public void setMusicviewer(MusicViewer musicviewer) {
		this.musicviewer = musicviewer;
	}

	
}

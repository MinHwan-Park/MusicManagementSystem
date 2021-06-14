package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.MenuSelection;
import GUI.MusicAdder;
import GUI.WindowFrame;

public class MusicAdderCancelListener implements ActionListener {
	
	WindowFrame frame;

	public MusicAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		MenuSelection cancel = frame.getMenuselection();
		frame.setupPanel(cancel);
	}

}

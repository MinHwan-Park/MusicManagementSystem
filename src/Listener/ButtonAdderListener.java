package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.MusicAdder;
import GUI.WindowFrame;

public class ButtonAdderListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonAdderListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		MusicAdder adder = frame.getMusicadder();
		frame.setupPanel(adder);
	}

}

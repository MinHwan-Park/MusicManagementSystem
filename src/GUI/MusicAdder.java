package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import oopManagementSystem.MusicManager;

public class MusicAdder extends JPanel {

	WindowFrame frame;
	MusicManager musicmanager;
	
	public MusicAdder(WindowFrame frame, MusicManager musicmanager) {
		this.frame = frame;
		this.musicmanager = musicmanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNumber = new JLabel("Number : ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelTitle = new JLabel("Title : ", JLabel.TRAILING);
		JTextField fieldTitle = new JTextField(10);
		labelTitle.setLabelFor(fieldTitle);
		panel.add(labelTitle);
		panel.add(fieldTitle);
		
		JLabel labelArtist = new JLabel("Artist : ", JLabel.TRAILING);
		JTextField fieldArtist = new JTextField(10);
		labelArtist.setLabelFor(fieldArtist);
		panel.add(labelArtist);
		panel.add(fieldArtist);
		
		JLabel labelArranger = new JLabel("Arranger : ", JLabel.TRAILING);
		JTextField fieldArranger = new JTextField(10);
		labelArranger.setLabelFor(fieldArranger);
		panel.add(labelArranger);
		panel.add(fieldArranger);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancle"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}

}

package GUI;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Music.MusicInput;
import oopManagementSystem.MusicManager;

public class MusicViewer extends JPanel {
	
	WindowFrame frame;
	MusicManager musicmanager;

	public MusicViewer(WindowFrame frame, MusicManager musicmanager) {
		this.frame = frame;
		this.musicmanager = musicmanager;
		
		System.out.println("***" + musicmanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Title");
		model.addColumn("Artist");
		model.addColumn("Arranger");
		model.addColumn("Contact INFO.");
		
		for(int i = 0; i < musicmanager.size(); i++) {
			Vector row = new Vector();
			MusicInput mi = musicmanager.get(i);
			row.add(mi.getNumber());
			row.add(mi.getTitle());
			row.add(mi.getArtist());
			row.add(mi.getArranger());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}

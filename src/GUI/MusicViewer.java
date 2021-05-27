package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class MusicViewer extends JFrame {

	public MusicViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Title");
		model.addColumn("Artist");
		model.addColumn("Arranger");
		model.addColumn("Contact INFO.");

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

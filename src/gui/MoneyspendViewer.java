package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MoneyspendViewer extends JFrame {

	public MoneyspendViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Type");
		model.addColumn("Date");
		model.addColumn("Amount");
		model.addColumn("Detail");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);		
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}

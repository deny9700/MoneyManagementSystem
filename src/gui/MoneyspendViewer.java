package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Moneyspend.MoneyInput;
import manager.MoneyspendManager;

public class MoneyspendViewer extends JPanel {
	
	WindowFrame frame;
	
	MoneyspendManager moneyspendManager;

	public MoneyspendViewer(WindowFrame frame, MoneyspendManager moneyspendManager) {
		this.frame = frame;
		this.moneyspendManager = moneyspendManager;
		
		System.out.println("***" + moneyspendManager.size() + "***");		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Type");
		model.addColumn("Date");
		model.addColumn("Amount");
		model.addColumn("Detail");
		
		for (int i=0; i<moneyspendManager.size(); i++) {
			Vector row = new Vector();
			MoneyInput mi = moneyspendManager.get(i);
			row.add(mi.getMoneytype());
			row.add(mi.getMoneydate());
			row.add(mi.getMoneyamount());
			row.add(mi.getMoneydetail());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);		
	}
	
}

package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MoneyspendAdder extends JFrame{
	
	public MoneyspendAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelType = new JLabel("Type: ", JLabel.TRAILING);
		JTextField fieldType = new JTextField(10);
		labelType.setLabelFor(fieldType);
		panel.add(labelType);
		panel.add(fieldType);
		
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelType.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);
		
		JLabel labelAmount = new JLabel("Amount: ", JLabel.TRAILING);
		JTextField fieldAmount = new JTextField(10);
		labelType.setLabelFor(fieldAmount);
		panel.add(labelAmount);
		panel.add(fieldAmount);
		
		JLabel labelDetail = new JLabel("Detail: ", JLabel.TRAILING);
		JTextField fieldDetail = new JTextField(10);
		labelType.setLabelFor(fieldDetail);
		panel.add(labelDetail);
		panel.add(fieldDetail);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}
}

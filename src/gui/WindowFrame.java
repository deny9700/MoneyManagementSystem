package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.MoneyspendManager;

public class WindowFrame extends JFrame {
	
	MoneyspendManager moneyspendManager;
	MenuSelection menuselection;
	MoneyspendAdder moneyspendadder;
	MoneyspendViewer moneyspendviewer;
	
	public WindowFrame(MoneyspendManager moneyspendManager) {
				
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");

		this.moneyspendManager = moneyspendManager;
		menuselection = new MenuSelection(this);
		moneyspendadder = new MoneyspendAdder(this);
		moneyspendviewer = new MoneyspendViewer(this, this.moneyspendManager);


		this.setupPanel(menuselection);
		
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

	public MoneyspendAdder getMoneyspendadder() {
		return moneyspendadder;
	}

	public void setMoneyspendadde(MoneyspendAdder moneyspendadde) {
		this.moneyspendadder = moneyspendadder;
	}

	public MoneyspendViewer getMoneyspendviewer() {
		return moneyspendviewer;
	}

	public void setMoneyspendviewer(MoneyspendViewer moneyspendviewer) {
		this.moneyspendviewer = moneyspendviewer;
	}
}

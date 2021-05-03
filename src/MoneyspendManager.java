import java.util.ArrayList;
import java.util.Scanner;

import Moneyspend.BankTransferMoneyspend;
import Moneyspend.CreditCardMoneyspend;
import Moneyspend.MoneySpendMethod;
import Moneyspend.Moneyspend;

public class MoneyspendManager {
	ArrayList<Moneyspend> moneyspends = new ArrayList<Moneyspend>();
	Scanner input;
	MoneyspendManager(Scanner input) {
		this.input = input;
	}
	
	public void addmoney () {
		int moneyspendmethod = 0;
		Moneyspend moneyspend;
		while (moneyspendmethod != 1 && moneyspendmethod != 2) {
			System.out.println("1 for Check Card");
			System.out.println("2 for Credit Card");
			System.out.println("3 for Bank Transfer");
			System.out.print("Select num for Money Spend Method between 1, 2 or 3:");
			moneyspendmethod = input.nextInt();
			
			if(moneyspendmethod == 1) {
				moneyspend = new Moneyspend(MoneySpendMethod.CheckCard);
				moneyspend.getMoneyInput(input);
				moneyspends.add(moneyspend);
				break;
			}
			
			else if (moneyspendmethod == 2) {
				moneyspend = new CreditCardMoneyspend(MoneySpendMethod.CreditCard);
				moneyspend.getMoneyInput(input);
				moneyspends.add(moneyspend);
				break;
			}
			
			else if (moneyspendmethod == 3) {
				moneyspend = new BankTransferMoneyspend(MoneySpendMethod.BankTransfer);
				moneyspend.getMoneyInput(input);
				moneyspends.add(moneyspend);
				break;
			}
			
			else {
				System.out.print("Select num for Money Spend Method between 1 and 2:");
			}
		}
	}
	
	public void deletemoney () {
		System.out.print("Delete Money Spend Type:");
		int moneyspendtype = input.nextInt();
		int index = -1;
		for (int i = 0; i<moneyspends.size(); i++) {
			if (moneyspends.get(i).getMoneytype() == moneyspendtype) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			moneyspends.remove(index);
			System.out.println("This spend history" + moneyspendtype + "is deleted");
		}
		else {
			System.out.println("This spend record has not been recorded");
			return;
		}
	}
	
	public void editmoney () {
		System.out.print("Edit Money Spend Type:");
		int moneyspendtype = input.nextInt();
		for (int i = 0; i<moneyspends.size(); i++) {
			Moneyspend moneyspend = moneyspends.get(i);
			if (moneyspend.getMoneytype() == moneyspendtype) {
				int num = -1;
				while (num != 5) {
					System.out.println("*** Money Management Edit Menu ***");
					System.out.println("1. Edit Type of Money Spend");
					System.out.println("2. Edit Date of Money Spend");
					System.out.println("3. Edit Amount of Money Spend");
					System.out.println("4. Edit Detail of Money Spend");
					System.out.println("5. Exit");
					System.out.print("Select one number between 1 - 5 : ");
					num = input.nextInt();
					if(num == 1) {
						System.out.print("Type of Money Spend:");
						int moneytype = input.nextInt();
						moneyspend.setMoneytype(moneytype);
					}
					else if (num == 2) {
						System.out.print("Date of Money Spend History:");
						String moneydate = input.next();
						moneyspend.setMoneydate(moneydate);
					}
					else if (num == 3 ) {
						System.out.print("Amount of Money Spend History(Won):");
						int moneyamount = input.nextInt();
						moneyspend.setMoneyamount(moneyamount);
					}
					else if (num == 4 ) {
						System.out.print("Detail of Money Spend History(No Space):");
						input.nextLine();
						String moneydetail = input.nextLine();
						moneyspend.setMoneydetail(moneydetail);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewmoneys () {
//		System.out.print("Input Money Spend Type:");
//		int moneyspendtype = input.nextInt();
		for (int i = 0; i<moneyspends.size(); i++) {
			moneyspends.get(i).printInfo();
		}
	}
}

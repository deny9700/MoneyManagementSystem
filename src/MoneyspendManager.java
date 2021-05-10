import java.util.ArrayList;
import java.util.Scanner;

import Moneyspend.BankTransferMoneyspend;
import Moneyspend.CheckCardMoneyspend;
import Moneyspend.CreditCardMoneyspend;
import Moneyspend.MoneyInput;
import Moneyspend.MoneySpendMethod;
import Moneyspend.Moneyspend;

public class MoneyspendManager {
	ArrayList<MoneyInput> moneyspends = new ArrayList<MoneyInput>();
	Scanner input;
	MoneyspendManager(Scanner input) {
		this.input = input;
	}
	
	public void addmoney () {
		int moneyspendmethod = 0;
		MoneyInput moneyInput;
		while (moneyspendmethod != 1 && moneyspendmethod != 2 && moneyspendmethod != 3) {
			System.out.println("1 for Check Card");
			System.out.println("2 for Credit Card");
			System.out.println("3 for Bank Transfer");
			System.out.print("Select num for Money Spend Method between 1, 2 or 3:");
			moneyspendmethod = input.nextInt();
			
			if(moneyspendmethod == 1) {
				moneyInput = new CheckCardMoneyspend(MoneySpendMethod.CheckCard);
				moneyInput.getMoneyInput(input);
				moneyspends.add(moneyInput);
				break;
			}
			
			else if (moneyspendmethod == 2) {
				moneyInput = new CreditCardMoneyspend(MoneySpendMethod.CreditCard);
				moneyInput.getMoneyInput(input);
				moneyspends.add(moneyInput);
				break;
			}
			
			else if (moneyspendmethod == 3) {
				moneyInput = new BankTransferMoneyspend(MoneySpendMethod.BankTransfer);
				moneyInput.getMoneyInput(input);
				moneyspends.add(moneyInput);
				break;
			}
			
			else {
				System.out.print("Select num for Money Spend Method between 1, 2 or 3:");
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
			MoneyInput moneyInput = moneyspends.get(i);
			if (moneyInput.getMoneytype() == moneyspendtype) {
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
						moneyInput.setMoneytype(moneytype);
					}
					else if (num == 2) {
						System.out.print("Date of Money Spend History:");
						String moneydate = input.next();
						moneyInput.setMoneydate(moneydate);
					}
					else if (num == 3 ) {
						System.out.print("Amount of Money Spend History(Won):");
						int moneyamount = input.nextInt();
						moneyInput.setMoneyamount(moneyamount);
					}
					else if (num == 4 ) {
						System.out.print("Detail of Money Spend History(No Space):");
						input.nextLine();
						String moneydetail = input.nextLine();
						moneyInput.setMoneydetail(moneydetail);
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

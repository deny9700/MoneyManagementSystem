import java.util.ArrayList;
import java.util.InputMismatchException;
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
			try {
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
			catch(InputMismatchException e) {
				System.out.print("Please select one number between 1 - 3! ");
				if(input.hasNext()) {
					input.next();
				}
				moneyspendmethod = -1;
			}
			
		}
	}
	
	public void deletemoney () {
		System.out.print("Delete Money Spend Type:");
		int moneyspendtype = input.nextInt();
		int index = findIndex(moneyspendtype);
		removefromMoneyspends(index, moneyspendtype);
	}
	
	public void editmoney () {
		System.out.print("Edit Money Spend Type:");
		int moneyspendtype = input.nextInt();
		for (int i=0; i<moneyspends.size(); i++) {
			MoneyInput money = moneyspends.get(i);
			if (money.getMoneytype() == moneyspendtype) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						money.setMoneyspendType(input);
						break;
					case 2:
						money.setMoneyspendDate(input);
						break;
					case 3:
						money.setMoneyspendAmount(input);
						break;
					case 4:
						money.setMoneyspendDetail(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewmoneys () {
		for (int i=0; i<moneyspends.size(); i++) {
			moneyspends.get(i).printInfo();
		}
	}
	
	public int findIndex(int moneyspendtype) {
		int index = -1;
		for (int i = 0; i<moneyspends.size(); i++) {
			if (moneyspends.get(i).getMoneytype() == moneyspendtype) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromMoneyspends(int index, int moneyspendtype) {
		if (index >= 0) {
			moneyspends.remove(index);
			System.out.println("This spend history" + moneyspendtype + "is deleted");
			return 1;
		}
		else {
			System.out.println("This spend record has not been recorded");
			return -1;
		}
	}
	
	public void showEditMenu() {
		System.out.println("*** Money Management Edit Menu ***");
		System.out.println("1. Edit Type of Money Spend");
		System.out.println("2. Edit Date of Money Spend");
		System.out.println("3. Edit Amount of Money Spend");
		System.out.println("4. Edit Detail of Money Spend");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5 : ");
	}
}

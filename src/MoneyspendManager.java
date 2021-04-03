import java.util.Scanner;

public class MoneyspendManager {
	Moneyspend moneyspend;
	Scanner input;
	MoneyspendManager(Scanner input) {
		this.input =  input;
	}
	
	public void addmoney () {
		moneyspend = new Moneyspend();
		System.out.println("Eat:1, Transportation:2, Play outside:3, Other:4");
		System.out.print("Type of Money Spend:");
		moneyspend.moneytype = input.nextInt();
		System.out.print("Date of Money Spend:");
		moneyspend.moneydate = input.next();
		System.out.print("Amount of Money Spend(Won):");
		moneyspend.moneyamount = input.nextInt();
		System.out.print("Detail of Money Spend:");
		moneyspend.moneydetail = input.next();
	}
	
	public void deletemoney () {
		System.out.print("Delete Money Spend:");
		int deletemoneyspend = input.nextInt();
	}
	
	public void editmoney () {
		System.out.print("Edit Money Spend:");
		int editmoneyspend = input.nextInt();
	}
	
	public void viewmoney () {
		System.out.print("View Money Spend:");
		int viewmoneyspend = input.nextInt();
	}
}

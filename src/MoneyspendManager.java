import java.util.Scanner;

public class MoneyspendManager {
	Moneyspend moneyspend;
	Scanner input;
	MoneyspendManager(Scanner input) {
		this.input =  input;
	}
	
	public void addmoney () {
		moneyspend = new Moneyspend();
		System.out.println("Eat:1, Transportation:2, Play outside:3, Other:4\n"
				+ "+ spend number in 3 digits ex)1001,2033");
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
		System.out.print("Delete Money Spend Type:");
		int moneyspendtype = input.nextInt();
		if (moneyspend == null) {
			System.out.println("This spend record has not been recorded");
			return;
		}
		if (moneyspend.moneytype == moneyspendtype) {
			moneyspend = null;
			System.out.println("This spend record is deleted");
		}
	}
	
	public void editmoney () {
		System.out.print("Edit Money Spend Type:");
		int moneyspendtype = input.nextInt();
		if (moneyspend.moneytype == moneyspendtype) {
			System.out.println("The spend record to be edited is "+ moneyspendtype);
		}
	}
	
	public void viewmoney () {
		System.out.print("View Money Spend:");
		int moneyspendtype = input.nextInt();
		if (moneyspend.moneytype == moneyspendtype) {
			moneyspend.printInfo();
		}
	}
}

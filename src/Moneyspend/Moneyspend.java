package Moneyspend;

import java.util.Scanner;

public class Moneyspend {
	protected MoneySpendMethod method = MoneySpendMethod.CheckCard;
	protected int moneytype;
	protected String moneydate;
	protected int moneyamount;
	protected String moneydetail;
	
	public Moneyspend() {
	}
	
	public Moneyspend(MoneySpendMethod method) {
		this.method = method;
	}
	
	public Moneyspend(int moneytype, String moneydate, int moneyamount) {
		this.moneytype = moneytype;
		this.moneydate = moneydate;
		this.moneyamount = moneyamount;
	}
	
	public Moneyspend(int moneytype, String moneydate, int moneyamount, String moneydetail) {
		this.moneytype = moneytype;
		this.moneydate = moneydate;
		this.moneyamount = moneyamount;
		this.moneydetail = moneydetail;
	}
	
	public Moneyspend(MoneySpendMethod method, int moneytype, String moneydate, int moneyamount, String moneydetail) {
		this.method = method;
		this.moneytype = moneytype;
		this.moneydate = moneydate;
		this.moneyamount = moneyamount;
		this.moneydetail = moneydetail;
	}
	
	public MoneySpendMethod getMethod() {
		return method;
	}

	public void setMethod(MoneySpendMethod method) {
		this.method = method;
	}

	public int getMoneytype() {
		return moneytype;
	}

	public void setMoneytype(int moneytype) {
		this.moneytype = moneytype;
	}

	public String getMoneydate() {
		return moneydate;
	}

	public void setMoneydate(String moneydate) {
		this.moneydate = moneydate;
	}

	public int getMoneyamount() {
		return moneyamount;
	}

	public void setMoneyamount(int moneyamount) {
		this.moneyamount = moneyamount;
	}

	public String getMoneydetail() {
		return moneydetail;
	}

	public void setMoneydetail(String moneydetail) {
		this.moneydetail = moneydetail;
	}
	
	public void printInfo() {
		String smethod = "none";
		switch(this.method) {
		case CheckCard:
			smethod = "Check";
			break;
		case CreditCard:
			smethod = "Credit";
			break;
		case BankTransfer:
			smethod = "Bank";
			break;
		case Cash:
			smethod = "Cash";
			break;
		default:
		}
		System.out.println("Method:" + smethod + "Type:" + moneytype + "Date:" + moneydate + "Amount:" + moneyamount + "Detail:" + moneydetail);
	}
	
	public void getMoneyInput(Scanner input) {
		System.out.println("Eat:1, Transportation:2, Play outside:3, Other:4\n"
				+ "+ spend number in 3 digits ex)1001,2033");
		System.out.print("Type of Money Spend:");
		int moneytype = input.nextInt();
		this.setMoneytype(moneytype);
		
		System.out.print("Date of Money Spend History:");
		String moneydate = input.next();
		this.setMoneydate(moneydate);
		
		System.out.print("Amount of Money Spend History(Won):");
		int moneyamount = input.nextInt();
		this.setMoneyamount(moneyamount);
		
		System.out.print("Detail of Money Spend History(No Space):");
		input.nextLine();
		String moneydetail = input.nextLine();
		this.setMoneydetail(moneydetail);
	}
}

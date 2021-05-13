package Moneyspend;

import java.util.Scanner;

import exception.MoneyDateException;

public abstract class Moneyspend implements MoneyInput {
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

	public void setMoneydate(String moneydate) throws MoneyDateException {
		if(moneydate.contains("-")) {
			throw new MoneyDateException();
		}
		
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
	
	public abstract void printInfo();
	
	public void setMoneyspendType(Scanner input) {
		System.out.print("Type of Money Spend:");
		int moneytype = input.nextInt();
		this.setMoneytype(moneytype);
	}
	
	public void setMoneyspendDate(Scanner input) {
		String date = "";
		while(!moneydate.contains("-")) {
			System.out.print("Date of Money Spend History:");
			String moneydate = input.next();
			try {
				this.setMoneydate(moneydate);
			}
			catch (MoneyDateException e) {
				System.out.println("Incorrect Date Format. Put '-' between year, month and date.");
			}
		}
	}
	
	public void setMoneyspendAmount(Scanner input) {
		System.out.print("Amount of Money Spend History(Won):");
		int moneyamount = input.nextInt();
		this.setMoneyamount(moneyamount);
	}
	
	public void setMoneyspendDetail(Scanner input) {
		System.out.print("Detail of Money Spend History(No Space):");
		input.nextLine();
		String moneydetail = input.nextLine();
		this.setMoneydetail(moneydetail);
	}
	
	public String getMethodString() {
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
		return smethod;
	}
}

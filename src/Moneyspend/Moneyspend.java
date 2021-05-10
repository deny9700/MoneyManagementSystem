package Moneyspend;

import java.util.Scanner;

public abstract class Moneyspend {
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
	
	public abstract void printInfo();
}

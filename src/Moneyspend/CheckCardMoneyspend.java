package Moneyspend;

import java.util.Scanner;

public class CheckCardMoneyspend extends NonCashMoneyspend {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5175261955093447633L;

	public CheckCardMoneyspend(MoneySpendMethod method) {
		super(method);
	}
	
	public void getMoneyInput(Scanner input) {
		System.out.println("Eat:1, Transportation:2, Play outside:3, Other:4\n"
				+ "+ spend number in 3 digits ex)1001,2033");
		setMoneyspendType(input);
		setMoneyspendDate(input);
		setMoneyspendAmount(input);
		setMoneyspendDetail(input);
	}
	
	public void printInfo() {
		String smethod = getMethodString();
		System.out.println("Method:" + smethod + "Type:" + moneytype + "Date:" + moneydate + "Amount:" + moneyamount + "Detail:" + moneydetail);
	}
}

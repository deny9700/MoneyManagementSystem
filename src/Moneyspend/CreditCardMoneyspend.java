package Moneyspend;

import java.util.Scanner;

public class CreditCardMoneyspend extends NonCashMoneyspend {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7723125958034275292L;

	public CreditCardMoneyspend(MoneySpendMethod method) {
		super(method);
	}
	
	public void getMoneyInput(Scanner input) {
		setMoneyInputwithYN(input);
	}
	
	public void printInfo() {
		String smethod = getMethodString();
		System.out.println("Method:" + smethod + "Type:" + moneytype + "Date:" + moneydate + "Amount:" + moneyamount + "Detail:" + moneydetail);
	}
}

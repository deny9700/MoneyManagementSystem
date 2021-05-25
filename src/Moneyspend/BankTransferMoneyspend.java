package Moneyspend;

import java.util.Scanner;

public class BankTransferMoneyspend extends NonCashMoneyspend {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7903012839210973412L;
	
	protected int parentMoneytype;
	
	public BankTransferMoneyspend(MoneySpendMethod method) {
		super(method);
	}
	
	public void getMoneyInput(Scanner input) {
		setRegularMoneyInputwithYN(input);
	}
	
	public void printInfo() {
		String smethod = getMethodString();
		System.out.println("Method:" + smethod + "Type:" + moneytype + "Date:" + moneydate + "Amount:" + moneyamount + "Detail:" + moneydetail + "Parent's Money: " + moneytype);
	}
	
	public void setRegularMoneyInputwithYN(Scanner input) {
		char answer1= 'x';
		while(answer1 !='y' && answer1!='Y' && answer1!='n' && answer1!='N') {			
			System.out.print("정기적으로 지출되는 돈입니까?(Y/N):");
			answer1 = input.next().charAt(0);
			
	        if (answer1 == 'Y'||answer1 == 'y') {	        	
	        	setMoneyInputwithYN(input);
	        }
	        
	        else if(answer1 == 'n' || answer1 == 'N') {	        	
	        	setMoneyInputwithYN(input); 
	        }
	        else {
	        }
		}
	}
}

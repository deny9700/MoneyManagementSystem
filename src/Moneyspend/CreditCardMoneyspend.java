package Moneyspend;

import java.util.Scanner;

public class CreditCardMoneyspend extends Moneyspend implements MoneyInput {
	
	public CreditCardMoneyspend(MoneySpendMethod method) {
		super(method);
	}
	
	public void getMoneyInput(Scanner input) {
		char answer= 'x';
		while(answer !='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.print("정기적으로 지출되는 돈입니까?(Y/N):");
			answer = input.next().charAt(0);
			
	        if (answer == 'Y'||answer == 'y') {
	            System.out.print("Date of Money Spend in One Month: ");
	            String Moneydate = input.next();
	            this.setMoneydate(Moneydate);
	            System.out.print("Amount of Money Spend: ");
	            int Moneyamount = input.nextInt();
	            this.setMoneyamount(Moneyamount);
	            System.out.print("Detail of Money Spend(No Space): ");
	            input.nextLine();
	    		String Moneydetail = input.nextLine();
	    		this.setMoneydetail(Moneydetail);
	            break;
	        }
	        
	        else if(answer == 'n' || answer == 'N') {
	        	
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
	            break;
	        }
	        
	        else {
	        }
		}
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
}

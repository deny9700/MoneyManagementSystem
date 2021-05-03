package Moneyspend;

import java.util.Scanner;

public class CreditCardMoneyspend extends Moneyspend {
	
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
	        	
	        	super.getMoneyInput(input);
	            break;
	        }
	        
	        else {
	        }
		}
	}
}

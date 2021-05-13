
package Moneyspend;

import java.util.Scanner;

public abstract class NonCashMoneyspend extends Moneyspend {

	public NonCashMoneyspend(MoneySpendMethod method) {
		super(method);
	}
	
	@Override
	public abstract void getMoneyInput(Scanner input);

	@Override
	public void printInfo() {
		String smethod = getMethodString();
		System.out.println("Method:" + smethod + "Type:" + moneytype + "Date:" + moneydate + "Amount:" + moneyamount + "Detail:" + moneydetail);
	}

	public void setMoneyInputwithYN(Scanner input) {
		char answer= 'x';
		while(answer !='y'&& answer!='Y' && answer!='n' && answer!='N') {	        		
			System.out.print("본인의 돈입니까?(Y/N):");
			answer = input.next().charAt(0);
			
    		if (answer == 'Y'||answer == 'y') {		        	
    			setMoneyspendDate(input);
    			setMoneyspendAmount(input);
    			setMoneyspendDetail(input);
	            break;
       
    		}
	        else if(answer == 'n' || answer == 'N') {
	        	System.out.println("Eat:1, Transportation:2, Play outside:3, Other:4\n"
	    				+ "+ spend number in 3 digits ex)1001,2033");
	        	setMoneyspendType(input);
	    		setMoneyspendDate(input);
    			setMoneyspendAmount(input);
    			setMoneyspendDetail(input);
	            break;
	        }
	        else {
	        }
    	}
	}
}

package Moneyspend;

import java.util.Scanner;

public class BankTransferMoneyspend extends Moneyspend {
	
	protected int parentMoneytype;
	
	public BankTransferMoneyspend(MoneySpendMethod method) {
		super(method);
	}
	
	public void getMoneyInput(Scanner input) {
		char answer1= 'x';
		char answer2= 'x';
		while(answer1 !='y'&&answer1!='Y'&&answer1!='n'&&answer1!='N') {
			System.out.print("정기적으로 지출되는 돈입니까?(Y/N):");
			answer1 = input.next().charAt(0);
			
	        if (answer1 == 'Y'||answer1 == 'y') {
	        	while(answer2 !='y'&&answer2!='Y'&&answer2!='n'&&answer2!='N') {
	    			System.out.print("your money??(Y/N):");
	    			answer2 = input.next().charAt(0);
	    			
	        		if (answer2 == 'Y'||answer2 == 'y') {
		        	
		        	
	        			System.out.print("Date of Money Spend in One Month: ");
		        		String sMoneydate = input.next();
			            this.setMoneydate(sMoneydate);
			            System.out.print("Amount of Money Spend: ");
			            int sMoneyamount = input.nextInt();
			            this.setMoneyamount(sMoneyamount);
			            System.out.print("Detail of Money Spend(No Space): ");
			            input.nextLine();
			    		String sMoneydetail = input.nextLine();
			    		this.setMoneydetail(sMoneydetail);
			            break;
		       
	        		}

	    	        else if(answer2 == 'n' || answer2 == 'N') {

	    	        	super.getMoneyInput(input);
	    	            break;
	    	        }
	    	        
	    	        else {
	    	        }
	        	}
	        }
	        
	        else if(answer1 == 'n' || answer1 == 'N') {
		        while(answer2 !='y'&&answer2!='Y'&&answer2!='n'&&answer2!='N') {
		        	System.out.print("your money??(Y/N):");
	    			answer2 = input.next().charAt(0);
	    			
	        		if (answer2 == 'Y'||answer2 == 'y') {
		        	
		        	
	        			System.out.print("Date of Money Spend in One Month: ");
		        		String sMoneydate = input.next();
			            this.setMoneydate(sMoneydate);
			            System.out.print("Amount of Money Spend: ");
			            int sMoneyamount = input.nextInt();
			            this.setMoneyamount(sMoneyamount);
			            System.out.print("Detail of Money Spend(No Space): ");
			            input.nextLine();
			    		String sMoneydetail = input.nextLine();
			    		this.setMoneydetail(sMoneydetail);
			            break;
		       
	        		}

	    	        else if(answer2 == 'n' || answer2 == 'N') {
	    		        
	    	        	super.getMoneyInput(input);
	    	            break;
	    	        }
	    	        else {
	    	        }
		        }
		        
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
		System.out.println("Method:" + smethod + "Type:" + moneytype + "Date:" + moneydate + "Amount:" + moneyamount + "Detail:" + moneydetail + "Parent's Money: " + moneytype);
	}
}

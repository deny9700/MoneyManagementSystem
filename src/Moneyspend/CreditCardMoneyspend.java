package Moneyspend;

import java.util.Scanner;

public class CreditCardMoneyspend extends Moneyspend {
	
	public void getMoneyInput(Scanner input) {
		System.out.print("정기적으로 지출되는 돈입니까?(한달):");
		char answer = input.next().charAt(0);
        if (answer == 'Y'||answer == 'y') {
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
        else if(answer == 'n' || answer == 'N') {
        	this.setMoneydate(sMoneydate);
            this.setWeekplan(weekplan);
            this.setEdate(edate);
            break;
        }
        else {

        }
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

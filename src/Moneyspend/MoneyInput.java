package Moneyspend;

import java.util.Scanner;

public interface MoneyInput {
	
	public int getMoneytype();
	
	public void setMoneytype(int moneytype);
	
	public void setMoneydate(String moneydate);
	
	public void setMoneyamount(int moneyamount);
	
	public void setMoneydetail(String moneydetail);
	
	public void getMoneyInput(Scanner input);
	
	public void printInfo();
}

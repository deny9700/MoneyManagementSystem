package Moneyspend;

import java.util.Scanner;

import exception.MoneyDateException;

public interface MoneyInput {
	
	public int getMoneytype();
	
	public void setMoneytype(int moneytype);
	
	public String getMoneydate();
	
	public void setMoneydate(String moneydate) throws MoneyDateException;
	
	public int getMoneyamount();
	
	public void setMoneyamount(int moneyamount);
	
	public String getMoneydetail();
	
	public void setMoneydetail(String moneydetail);
	
	public void getMoneyInput(Scanner input);
	
	public void printInfo();
	
	public void setMoneyspendType(Scanner input);
	
	public void setMoneyspendDate(Scanner input);
	
	public void setMoneyspendAmount(Scanner input);
	
	public void setMoneyspendDetail(Scanner input);
}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		MoneyspendManager moneyspendManager = getObject("moneyspendmanager.ser");
		if (moneyspendManager == null) {
			moneyspendManager = new MoneyspendManager(input);
		}
				
		selectMenu(input, moneyspendManager);
		putObject(moneyspendManager, "moneyspendmanager.ser");
	}
	
	public static void selectMenu(Scanner input, MoneyspendManager moneyspendManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					moneyspendManager.addmoney();
					logger.log("add money spend");
					break;
				case 2:
					moneyspendManager.deletemoney();
					logger.log("delete money spend");
					break;
				case 3:
					moneyspendManager.editmoney();
					logger.log("edit money spend");
					break;
				case 4:
					moneyspendManager.viewmoneys();
					logger.log("view money spend");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.print("Please select one number between 1 - 5! ");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Money Management System Menu ***");
		System.out.println("1. Add Money Spend History");
		System.out.println("2. Delete Money Spend History");
		System.out.println("3. Edit Money Spend History");
		System.out.println("4. View Money Spend Histories");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5 : ");
	}
	
	public static MoneyspendManager getObject(String filename) {
		MoneyspendManager moneyspendManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			moneyspendManager = (MoneyspendManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return moneyspendManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return moneyspendManager;
	}
	
	public static void putObject(MoneyspendManager moneyspendManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(moneyspendManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MoneyspendManager moneyspendManager = new MoneyspendManager(input);
		
		int num = -1;
		while (num != 5) {
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				moneyspendManager.addmoney();
				break;
			case 2:
				moneyspendManager.deletemoney();
				break;
			case 3:
				moneyspendManager.editmoney();
				break;
			case 4:
				moneyspendManager.viewmoneys();
				break;
			default:
				continue;
			}
		}
	}
	
	public static void showMenu () {
		System.out.println("*** Money Management System Menu ***");
		System.out.println("1. Add Money Spend History");
		System.out.println("2. Delete Money Spend History");
		System.out.println("3. Edit Money Spend History");
		System.out.println("4. View Money Spend Histories");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5 : ");
	}
}

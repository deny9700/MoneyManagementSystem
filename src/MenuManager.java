import java.util.Scanner;

public class MenuManager {
	
	public static void showMenu () {
		System.out.println("*** Money Management System Menu ***");
		System.out.println("1. Add Money Spend");
		System.out.println("2. Delete Money Spend");
		System.out.println("3. Edit Money Spend");
		System.out.println("4. View Money Spend");
		System.out.println("5. Show Menu");
		System.out.println("6. Exit");
		System.out.print("Select one number between 1 - 6 : ");
	}
	
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			showMenu();
			num = input.nextInt();
			if (num == 1) {
				System.out.println("Eat:1, Transportation:2, Play outside:3, Other:4");
				System.out.print("Type of Money Spend:");
				int typemoneyspend = input.nextInt();
				System.out.print("Date of Money Spend:");
				String datemoneyspend = input.next();
				System.out.print("Amount of Money Spend:");
				int amountmoneyspend = input.nextInt();
			}
			else if (num == 2) {
				System.out.print("Delete Money Spend:");
				int deletemoneyspend = input.nextInt();
			}
			else if (num == 3) {
				System.out.print("Edit Money Spend:");
				int editmoneyspend = input.nextInt();
			}
			else if (num == 4) {
				System.out.print("View Money Spend:");
				int viewmoneyspend = input.nextInt();
			}
			else if (num == 5) {
				showMenu();
			}
		}
	}
}

import java.util.Scanner;

public class MenuManager {
	
	public static void showMenu () {
		System.out.println("*** Money Management System Menu");
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
		
		showMenu();
		while (num != 6) {
			num = input.nextInt();
			
			if (num == 1) {
				
			}
			else if (num == 2) {
				
			}
			else if (num == 3) {
				
			}
			else if (num == 4) {
				
			}
			else if (num == 5) {
				showMenu();
			}

		}
	}
}

package Views;

import java.util.Scanner;

public interface AdministratorMenu {
	public static void AdministratorMenu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: View and Manage Hospital Staff");
			System.out.println("2: View Appointments Details");
			System.out.println("3: View and Manage Medication Inventory");
			System.out.println("4: Approve Replenishment Requests");
			System.out.println("5: Logout");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				break;
			case 2: 
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 5: 
				System.out.println("Logging out ….");
			}
		} while (choice < 5);
	    return;
	}
}

package Views;
import java.util.Scanner;

public interface DoctorMenu {
	public static void DoctorMenu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: View Patient Medical Records");
			System.out.println("2: Update Patient Medical Records");
			System.out.println("3: View Personal Schedule");
			System.out.println("4: Set Availability for Appointments");
			System.out.println("5: Accept or Decline Appointment Requests");
			System.out.println("6: View Upcoming Appointments");
			System.out.println("7: Record Appointment Outcome");
			System.out.println("8: Logout");
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
				break;
			case 6: 
				break;
			case 7: 
				break;
			case 8: 
				System.out.println("Logging out ….");
			}
		} while (choice < 8);
	    return;
	}
}
	


package Views;
import java.util.*;

public interface HMSApp{
    public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: Log In");
			System.out.println("2: Quit");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
			// should change to a UserMenu where users can enter their hospitalID and change password
				PatientMenu.PatientMenu();
			case 2: 
				System.out.println("Program terminating ….");
			}
		} while (choice < 2);
        return;
    }
}
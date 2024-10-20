package Views;
import java.util.*;
import java.io.*;

public class HMSApp{
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
				UserMenu userMenu = new UserMenu();
				userMenu.showMenu();
			case 2: 
				System.out.println("Program terminating ….");
			}
		} while (choice < 2);
        return;
    }
}
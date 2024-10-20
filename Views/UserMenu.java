package Views;
import java.util.Scanner;
import java.io.*;

public class UserMenu implements Menu {
    public void showMenu(){
        File csvFile = new File("..", "data/User_List.csv");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Hospital ID: ");
        String hospitalID = sc.next();
        
        System.out.print("Enter your password: ");
        String password = sc.next();




    }
    
}

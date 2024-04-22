
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sonnt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User();
        
        User test = new User("fuc", "fucpass");
        
        user.username = scanner.nextLine();
        user.password = scanner.nextLine();

        if (user.username.equals(DataStorage.data_user)
                && user.password.equals(DataStorage.data_pass)) {
            UserSession.loggedAccount = user;
            System.out.println("Login successful!");
            do {
                StupidScreen s1 = new StupidScreen();
                s1.displayStupidMessage();
                scanner.nextLine();
            } while (true);
        } else {
            System.out.println("Login failed");
        }

    }

}

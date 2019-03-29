package Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static ErrorMenu.WrongInput.errorStartMenu;
import static MainMenu.CustomerMenu.MainMenu;
import static StartMenu.Login.LoginMenu;
import static StartMenu.Register.insertDataCustomer;

/**
 * Owned by Naufal Muhammad Ischyros
 */
public class Main {

//    public static ICustomer iCustomer = new CustomerImpl();

    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    public static void main(String[] args) {
        startMenu();
    }
    public static void startMenu() {
        System.out.println("\n===== Welcome =====");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("0. Exit");
        System.out.println("===================");
        System.out.println("");
        System.out.print("Enter choice> ");

        try {
            String startmenu = input.readLine();

            if (startmenu.equals("0")) {
                System.out.println();
                System.out.println("See you later!");
                System.exit(0);
            } else if (startmenu.equals("1")) {
                insertDataCustomer();
                MainMenu();
            } else if (startmenu.equals("2")) {
                if (LoginMenu()) {
                    System.out.println("Login success");
                    MainMenu();;
                } else {
                    System.out.println("Login failed");
                    startMenu();
                }
            } else {
                System.out.println();
                System.out.println("Wrong choice, please input the right choice!");
                errorStartMenu();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

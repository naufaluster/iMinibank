package MainMenu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static ErrorMenu.WrongInput.errorMainMenu;
import static Main.Main.startMenu;
import static MainMenu.AccountMenu.Account;
import static MainMenu.TransactionMenu.Transaction;
import static MainMenu.WalletMenu.Wallet;

/**
 * Owned by Naufal Muhammad Ischyros
 */


public class CustomerMenu {

    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    public static void MainMenu() {
        System.out.println("\n==== Main Menu ====");
        System.out.println("1. Profile");
        System.out.println("2. Account");
        System.out.println("3. E-Wallet");
        System.out.println("4. Transaction");
        System.out.println();
        System.out.println("0. Logout");
        System.out.println("");
        System.out.print("Enter menu> ");

        try {
            String choice = input.readLine().trim();

            if (choice.equals("0")) {
                System.out.println();
                System.out.println("Thank you for banking with us!");
                startMenu();
            } else if (choice.equals("1")) {
                Profile();
                MainMenu();
            } else if (choice.equals("2")) {
                Account();
                MainMenu();
            } else if (choice.equals("3")) {
                Wallet();
                MainMenu();
            } else if (choice.equals("4")) {
                Transaction();
                MainMenu();
            } else if (choice.equals("0")) {
                startMenu();
                MainMenu();
            } else {
                System.out.println();
                System.out.println("Wrong choice, please input the right choice!");
                errorMainMenu();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Profile() {

    }

}
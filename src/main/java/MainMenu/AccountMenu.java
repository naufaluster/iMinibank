package MainMenu;

import Entity.Account;
import Entity.Customer;
import Implements.AccountImpl;
import Interfaces.IAccount;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;

import static Main.Main.failed;
import static Main.Main.success;
import static MainMenu.CustomerMenu.MainMenu;
import static StartMenu.Login.addAccount;
import static StartMenu.Register.padRight;

/**
 * Owned by Naufal Muhammad Ischyros
 */


public class AccountMenu {

    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static AccountMenu accountMenu;

//    static Customer customer = new Customer();



    public static void Account() {
        System.out.println("\n===== Account =====");
        System.out.println("1. List Account");
        System.out.println("2. Add");
        System.out.println("3. Remove");
        System.out.println();
        System.out.println("0. Main Menu");
        System.out.println("");
        System.out.print("Choose menu: ");

        try {
            String choice = input.readLine().trim();

            if (choice.equals("0")) {
                MainMenu();
            } else if (choice.equals("1")) {
//                listAccount(iAccount.listaccount(customer.getCif()));
                Account();
            } else if (choice.equals("2")) {
                addAccount();
                Account();
            } else if (choice.equals("3")) {
//                removeAccount();
                Account();
            } else {
                System.out.println("Wrong choice");
                Account();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}

package StartMenu;

import Entity.Account;
import Entity.Customer;
import Implements.AccountImpl;
import Implements.CustomerImpl;
import Interfaces.IAccount;
import Interfaces.ICustomer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

import static Main.Main.failed;
import static Main.Main.success;
import static StartMenu.Register.padRight;

/**
 * Owned by Naufal Muhammad Ischyros
 */
public class Login {

    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static ICustomer iCustomer = new CustomerImpl();
    static IAccount iAccount = new AccountImpl();
    static Account account = new Account();
    public static Customer customer = new Customer();

    public static boolean LoginMenu() {
        try {
            System.out.println("=== Login ===");
            System.out.print( "| " + padRight("Username", 10) + (": "));
            String username = input.readLine().trim();
//            customer.setUsername(input.readLine().trim());
            System.out.print( "| " + padRight("Password", 10) + (": "));
            String password = input.readLine().trim();
            System.out.println("=============");
//            customer.setPassword(input.readLine().trim());
            customer = iCustomer.login(username, password);
            if (customer != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void addAccount() {
        try {

            Calendar calendarDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

            int number = new Random().nextInt(2000 + 7000);
            String accountNumber = "ACN" + String.valueOf(number);
            account.setAccountNumber(accountNumber);

            System.out.println("==== Add Account ====");
            System.out.print( "| " + padRight("Account Name", 17) + (": "));
            account.setAccountName(input.readLine().trim());

            calendarDate.set(Calendar.YEAR, 2017);
            calendarDate.set(Calendar.MONTH, 10);
            calendarDate.set(Calendar.DAY_OF_MONTH, 15);
            account.setOpenDate(calendarDate);

            account.setBalance(1000000);

            account.setCustomerNumber(customer);
            if (iAccount.addAccount(account)) {
                success();
            } else {
                failed();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String padRight(String text, int l) {
        return String.format("%1$-" + l + "s", text);
    }

}

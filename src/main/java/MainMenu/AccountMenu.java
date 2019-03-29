package MainMenu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Owned by Naufal Muhammad Ischyros
 */


public class AccountMenu {

    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    public static void Account() {
        System.out.println("\n<===== Account =====>");
        System.out.println("1. Show");
        System.out.println("2. Add");
        System.out.println("3. Remove");
        System.out.println("0. Main Menu");
        System.out.println("");
        System.out.print("Choose menu: ");

        try {
            String choice = input.readLine().trim();

            if (choice.equals("0")) {
                menu2();
            } else if (choice.equals("1")) {
                showAccount(bankingDao.getAllAccount(customer.getCif()));
                account();
            } else if (choice.equals("2")) {
                addAccount(customer.getCif());
                account();
            } else if (choice.equals("3")) {
                removeAccount();
                account();
            } else {
                System.out.println("Wrong choice");
                account();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

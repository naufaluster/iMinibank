package StartMenu;

import Entity.Customer;
import Implements.CustomerImpl;
import Interfaces.ICustomer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Owned by Naufal Muhammad Ischyros
 */
public class Login {

    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static ICustomer iCustomer = new CustomerImpl();
    static Customer customer = new Customer();

    public static boolean LoginMenu() {
        try {
            System.out.println("Login");
            System.out.print("Username: ");
            String username = input.readLine().trim();
//            customer.setUsername(input.readLine().trim());
            System.out.print("Password: ");
            String password = input.readLine().trim();
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
}

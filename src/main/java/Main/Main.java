package Main;

import Implements.CustomerImpl;
import Interfaces.ICustomer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
        System.out.println("\n========= Tensai =========");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("0. Exit");
        System.out.println("");
        System.out.print("Enter choice> ");

        try {
            String startmenu = input.readLine();

            if ("0".equals(startmenu)) {
                System.out.println();
                System.out.println("Thank you for banking with us!");
                System.exit(0);

            } else if ("1".equals(startmenu)) {
                // insertDataCustomer();
                startMenu();

            } else {
                System.out.println();
                System.out.println("Wrong choice, please input the right choice!");
//                    errorStartMenu();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

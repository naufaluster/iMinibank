package ErrorMenu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static Main.Main.startMenu;
import static MainMenu.CustomerMenu.MainMenu;

/**
 * Owned by Naufal Muhammad Ischyros
 */
public class WrongInput {
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    public static void errorStartMenu(){
        System.out.println("");
        System.out.println("Enter any key to continue");
        System.out.print("Enter> ");

        try {
            String esm = input.readLine();
            switch (esm) {
                default:
                    startMenu();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void errorMainMenu(){
        System.out.println("");
        System.out.println("Enter any key to continue");
        System.out.print("Enter> ");

        try {
            String esm = input.readLine();
            switch (esm) {
                default:
                    MainMenu();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

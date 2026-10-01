
import java.util.Scanner;

public class Napari_Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables
        String correctUsername = "oyo2121";
        String correctPassword = "1234";

        String username;
        String password;

        int attempts = 0;
        int maxAttempts = 3;
        boolean loginSuccessful = false;

        // Login
        System.out.println("===== LOGIN SYSTEM =====");

        while (attempts < maxAttempts) {

            System.out.print("Enter username: ");
            username = scanner.nextLine();

            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (username.equals(correctUsername) &&
                    password.equals(correctPassword)) {

                loginSuccessful = true;
                System.out.println("Login successful!");
                System.out.println("Welcome, " + username + "!");

                break;

            } else {

                attempts++;

                System.out.println("Invalid username or password.");
                System.out.println("Attempts remaining: "
                        + (maxAttempts - attempts));
            }
        }

        if (!loginSuccessful && attempts >= maxAttempts) {
            System.out.println("Too many failed attempts.");
            System.out.println("Account temporarily locked.");
        }

        scanner.close();
    }
}
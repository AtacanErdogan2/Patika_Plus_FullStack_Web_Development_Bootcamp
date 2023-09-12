package Week_1;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        String userName, password, check = "N";


        // Retrieving data from the user
        System.out.print("Username :");
        userName = input.nextLine();
        System.out.print("Password :");
        password = input.nextLine();

        // Calculation Section

        if (userName.equals("Patika") && password.equals("Java101")) {
            System.out.println("Logging in");
        } else if (!userName.equals("Patika")) {
            System.out.println("Incorrect username!");
        } else if (!password.equals("Java101")) {
            System.out.println("Incorrect password!" + "Forget your password?");
            System.out.println("Would you like to reset your password? (Yes -> Y No -> N)");
            check = input.nextLine();
        }

        if (check.equals("Y")) {
            System.out.println("The new password you enter should not be the same as the password you forgot.");
            System.out.print("New Password:");
            password = input.nextLine();

            if (password.equals("Java101")) {
                System.out.println("The password could not be created. Please try again.");
            } else {
                System.out.println("The password has been created.");
            }
        }

    }
}

package Week_1;

import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int year;

        // Retrieving data from the user
        System.out.print("Please enter the year :");
        year = input.nextInt();

        // Calculation Section
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is a leap year !");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " is not a leap year !");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year !");
        } else {
            System.out.println(year + " is not a leap year !");
        }

    }
}

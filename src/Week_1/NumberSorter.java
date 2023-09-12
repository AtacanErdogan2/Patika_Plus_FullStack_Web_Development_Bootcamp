package Week_1;

import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int n1, n2, n3;

        // Retrieving data from the user
        System.out.print(" Please enter the first number : ");
        n1 = input.nextInt();
        System.out.print(" Please enter the second number : ");
        n2 = input.nextInt();
        System.out.print(" Please enter the third number : ");
        n3 = input.nextInt();

        // Calculation Section
        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println(n1 + " < " + n2 + " < " + n3);
            } else {
                System.out.println(n1 + " < " + n3 + " < " + n2);
            }
        }

        if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println(n2 + " < " + n1 + " < " + n3);
            } else {
                System.out.println(n2 + " < " + n3 + " < " + n1);
            }
        }

        if (n3 < n1 && n3 < n2) {
            if (n1 < n2) {
                System.out.println(n3 + " < " + n1 + " < " + n2);
            } else {
                System.out.println(n3 + " < " + n2 + " < " + n1);
            }
        }

    }
}

package Week_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int n1, n2, select;


        // Retrieving data from the user
        System.out.print("Please enter the first number : ");
        n1 = input.nextInt();
        System.out.print("Please enter the second number : ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication|\n4-Division");
        System.out.print("Your choice :");
        select = input.nextInt();

        // Calculation Section

        switch (select) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                break;
            default:
                System.out.println("You entered incorrect data");
                break;
        }

    }
}

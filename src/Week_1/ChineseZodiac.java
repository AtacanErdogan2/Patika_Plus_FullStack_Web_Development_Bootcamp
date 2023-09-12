package Week_1;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int year, zodiacNumber;
        String zodiacSign = "";

        // Retrieving data from the user
        System.out.print("Please enter your year of birth : ");
        year = input.nextInt();

        // Calculation Section
        zodiacNumber = year % 12;

        switch (zodiacNumber) {
            case 0:
                zodiacSign = "Monkey";
                break;
            case 1:
                zodiacSign = "Rooster";
                break;
            case 2:
                zodiacSign = "Dog";
                break;
            case 3:
                zodiacSign = "Pig";
                break;
            case 4:
                zodiacSign = "Rat";
                break;
            case 5:
                zodiacSign = "Ox";
                break;
            case 6:
                zodiacSign = "Tiger";
                break;
            case 7:
                zodiacSign = "Rabbit";
                break;
            case 8:
                zodiacSign = "Dragon";
                break;
            case 9:
                zodiacSign = "Snake";
                break;
            case 10:
                zodiacSign = "Horse";
                break;
            case 11:
                zodiacSign = "Goat";
                break;
        }

        System.out.println("Your Chinese zodiac sign: " + zodiacSign);

    }
}

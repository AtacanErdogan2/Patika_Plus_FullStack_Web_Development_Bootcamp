package Week_1;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int year, zodiacNumber;
        String zodiacSign;

        // Retrieving data from the user
        System.out.print("Please enter your year of birth : ");
        year = input.nextInt();

        // Calculation Section
        zodiacNumber = year % 12;

        switch (zodiacNumber) {
            case 0:
                zodiacSign = "Monkey";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
            case 1:
                zodiacSign = "Rooster";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
            case 2:
                zodiacSign = "Dog";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
            case 3:
                zodiacSign = "Pig";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
            case 4:
                zodiacSign = "Rat";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
            case 5:
                zodiacSign = "Ox";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
            case 6:
                zodiacSign = "Tiger";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
            case 7:
                zodiacSign = "Rabbit";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
            case 8:
                zodiacSign = "Dragon";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
            case 9:
                zodiacSign = "Snake";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
            case 10:
                zodiacSign = "Horse";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
            case 11:
                zodiacSign = "Goat";
                System.out.println("Your Chinese zodiac sign: " + zodiacSign);
                break;
        }


    }
}

package Week_1;
import java.util.Scanner;

public class AstrologicalSignCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int month, day;
        String sign = "";

        // Retrieving data from the user
        System.out.print("Please enter the month you born as number: ");
        month = input.nextInt();

        System.out.print("Please enter the day you born as number: ");
        day =  input.nextInt();

        // Calculation Section
        if (month == 1) {
            sign = day <= 20 ? "Capricorn" : "Aquarius" ;
        } else if (month == 2) {
            sign = day <= 19 ? "Aquarius" : "Pisces" ;
        } else if (month == 3) {
            sign = day <= 20 ? "Pisces" : "Aries" ;
        } else if (month == 4) {
            sign = day <= 20 ? "Aries" : "Taurus" ;
        } else if (month == 5) {
            sign = day <= 21 ? "Taurus" : "Gemini" ;
        } else if (month == 6) {
            sign = day <=21 ? "Gemini" : "Cancer" ;
        } else if (month == 7) {
            sign = day <= 23 ? "Cancer" : "Leo" ;
        } else if (month == 8) {
            sign = day <= 23 ? "Leo" : "Virgo" ;
        } else if (month == 9) {
            sign = day <= 23 ? "Virgo" : "Libra" ;
        } else if (month == 10) {
            sign = day <= 23 ? "Libra" : "Scorpio" ;
        } else if (month == 11) {
            sign = day <= 22 ? "Scorpio" : "Sagittarius" ;
        } else if (month == 12) {
            sign = day <= 22 ? "Sagittarius" : "Capricorn";
        }

        System.out.println("Your Astrological sign : " + sign);

    }
}

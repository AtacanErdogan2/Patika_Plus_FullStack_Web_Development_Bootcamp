package Week_1;

import java.util.Scanner;

public class EventRecommender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int temperature;

        // Retrieving data from the user
        System.out.print(" What's the temperature : ");
        temperature = input.nextInt();

        // Calculation Section
        if (temperature < 5) {
            System.out.println("The best thing to do in this cold will be to ski :)");
        } else if (temperature < 15) {
            System.out.println("The best thing to do in this temperature would be to go to the cinema :)");
        } else if (temperature < 25) {
            System.out.println("The best thing to do in this temperature would be to go to the picnic :)");
        } else {
            System.out.println("The best thing to do in this hot weather would be to swim :)");
        }

    }
}

package Week_1;

import java.util.Scanner;

public class GpaCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int mathScore, physicsScore, turkishScore, chemistryScore, musicScore;
        double counter = 5d; // for valid cases

        // Retrieving data from the user
        System.out.print("Please enter your Mathematics Score: ");
        mathScore = input.nextInt();
        if (!(mathScore >= 0 && mathScore <= 100)) {
            mathScore = 0;
            counter-- ;
        }

        System.out.print("Please enter your Physics Score: ");
        physicsScore = input.nextInt();
        if (!(physicsScore >= 0 && physicsScore <= 100)) {
            physicsScore = 0;
            counter-- ;
        }

        System.out.print("Please enter your Chemistry Score: ");
        chemistryScore = input.nextInt();
        if (!(chemistryScore >= 0 && chemistryScore <= 100)) {
            chemistryScore = 0;
            counter-- ;
        }

        System.out.print("Please enter your Turkish Score: ");
        turkishScore = input.nextInt();
        if (!(turkishScore >= 0 && turkishScore <= 100)) {
            turkishScore = 0;
            counter-- ;
        }

        System.out.print("Please enter your Music Score: ");
        musicScore = input.nextInt();
        if (!(musicScore >= 0 && musicScore <= 100)) {
            musicScore = 0;
            counter-- ;
        }

        // Calculation Section
        double average = (mathScore + physicsScore + turkishScore + chemistryScore + musicScore) / counter;

        if (average < 55) {
            System.out.print("You failed the class!");
        } else {
            System.out.print("You passed the class!");
        }

        System.out.print(" Your Average Score:" + average);

    }
}

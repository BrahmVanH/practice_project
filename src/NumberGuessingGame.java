import java.lang.Math;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String args[]) {

        System.out.println(("Guess a number between 1 and 20"));

        Scanner readInput = new Scanner(System.in);

        int tryCounter = 5;

        while (true) {

            double randomDouble = Math.floor(Math.random() * 20);
            int randomNumber = (int) randomDouble;
            System.out.println(randomNumber);

            while (true) {

                int userInt = readInput.nextInt();

                if (tryCounter <= 0) {
                    System.out.println("You ran out of tries");
                    readInput.close();
                }

                if (userInt > randomNumber) {
                    tryCounter--;
                    System.out.println("Guess a lower number, you have " + tryCounter + " tries left");

                }

                if (userInt < randomNumber) {
                    tryCounter--;
                    System.out.println("Guess a higher number, you have " + tryCounter + " tries left");
                }

                if (userInt == randomNumber) {
                    System.out.println("Correct!");
                    readInput.close();
                }
            }

        }
    }
}


// ****************************************************************
// Guess.java
// Play a game where the user guesses a number from 1 to 10
// ****************************************************************

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int play_again = 0;
        Scanner scan = new Scanner(System.in);

        while (play_again != -1) {
            int high_guess = 0;
            int low_guess = 0;
            int numToGuess; // Number the user tries to guess
            int guess; // The user's guess

            // randomly generate the number to guess
            numToGuess = (int) ((Math.random() * 100) + 1);

            // print message asking user to enter a guess
            System.out.println("Please enter a guess between 1 and 100");
            
            // read in guess
            guess = scan.nextInt();

            while (guess != numToGuess) // keep going as long as the guess is wrong
            {
                if (guess > numToGuess) {
                    System.out.println("Your guess is too high, go lower!");
                    high_guess++;
                } else {
                    System.out.println("Your guess is too low, go higher!");
                    low_guess++;
                }
                System.out.println("Please enter another guess between 1 and 100");
                guess = scan.nextInt();
            }

            // print message saying guess is right
            System.out.println("Congratulations, you guessed the number!");
            System.out.println("\nYou guessed high " + high_guess + " times and low " + low_guess + " times.");
            System.out.println("\nYou guessed a total of " + (high_guess + low_guess) + " times.\n");

            System.out.println("Would you like to play again? (-1 to quit, any other integer means yes)");
            play_again = scan.nextInt();

        }
        scan.close();
    }

}
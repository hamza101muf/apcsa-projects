/*
 * Hamza Mufti
 * 11/2/22
 * Rock Paper Scissors Game - computer plays rock paper scissors and plays against the user
 */

import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int keepGoing = 0;

    int draw = 0, wins = 0, loss = 0;

    // loop that keeps replaying until user quits
    while (keepGoing != -1) {
      System.out.println("Let's PLAY rock, paper, scissors! \n Here's how to play:\n\t choose 'r' for ROCK" +
          "\n\t choose 'p' for PAPER \n\t choose 's' for SCISSORS");

      // user choice of weapon
      System.out.print("Now choose your weapon: ");
      char choice = scan.next().charAt(0);

      // checks if matches valid input
      while ((choice != 'r') && (choice != 'p') && (choice != 's')) {
        System.out.print("You didn't choose one of the given options, please input one of the given options: ");
        choice = scan.next().charAt(0);
      }
      // matches input to weapon
      if (choice == 'r')
        System.out.println("You have chosen a ROCK.");
      else if (choice == 'p')
        System.out.println("You have chosen PAPER");
      else
        System.out.println("You have chosen SCISSORS");

      int computerChoice = (int) (Math.random() * 3) + 1;
      char computer;
      if (computerChoice == 1) {
        System.out.println("Computer has chosen ROCK");
        computer = 'r';
      } else if (computerChoice == 2) {
        System.out.println("Computer has chosen PAPER");
        computer = 'p';
      } else {
        System.out.println("Computer has chosen SCISSORS");
        computer = 's';
      }

      if (choice == computer) {
        System.out.println("You and the computer DRAW");
        draw++;
      } else if (((choice == 'r') && (computer == 's')) || (choice == 'p') && (computer == 'r')
          || (choice == 's') && (computer == 'p')) {
        System.out.println("YOU WIN!");
        wins++;
      } else {
        System.out.println("YOU LOSE!");
        loss++;
      }
      System.out.println("Here are your stats: \n\t Wins: " + wins + "\n\t Losses: " + loss + "\n\t Draws: " + draw);
      System.out.print("Would you like to play again? (-1 to quit, any other number means continue): ");
      keepGoing = scan.nextInt();
    }
    scan.close();
  }
}
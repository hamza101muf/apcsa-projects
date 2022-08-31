/*
 * Hamza Mufti
 * 08/29/22
 * 2.5 - app that converts from miles to km (or vice versa)
 */

import java.util.Scanner;

public class  Lab2_5
{
  public static void main (String[] args)
  {
    try(Scanner scan = new Scanner(System.in))
    {
    
    double convChoice;
    double miles, kilometers;
    System.out.println("Hi, would you like to \n Convert from MILES to KILOMETERS (press '1') \n Convert from KILOMETERS to MILES (press '2') ");
    convChoice = scan.nextInt();
    if (convChoice == 1) {
      System.out.println("OK, please input the MILES value you would like to input: ");
      miles = scan.nextDouble();
      kilometers = (miles*1.60935);
      System.out.println("Thanks, here's your new distance in KILOMETERS: " + kilometers);
    }
    else if (convChoice == 2) {
      System.out.println("OK, please input the KILOMETERS value you would like to input: ");
      kilometers = scan.nextDouble();
      miles = (kilometers/1.60935);
      System.out.println("Thanks, here's your new distance in MILES: " + miles);
    }
    else {
      System.out.println("Sorry, it looks like you didn't input an accepted value, please try again");
    }
  }
  }
}
      
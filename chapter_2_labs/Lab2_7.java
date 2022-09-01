/*
 * Hamza Mufti
 * 08/29/22
 * 2.7 - creating a reverse function of the previous seconds to HH:MM:SS format
 * (dedicated to all my bffs out there :)
 */
import java.util.Scanner;

public class Lab2_7
{
  public static void main (String[] args)
  {
    try (Scanner scan = new Scanner(System.in)) 
    // try keyword is meant to catch any errors that may occur in the program
    {
      int raw_time, hours, minutes, seconds;
      
      System.out.println("Hi, please input a time value in HOURS: ");
      hours = scan.nextInt();
      System.out.println("Thanks please input a time value in MINUTES: ");
      minutes = scan.nextInt();
      System.out.println("Thanks please input a time value in SECONDS: ");
      seconds = scan.nextInt();
      
      raw_time = (3600*hours + 60*minutes + seconds);
      
      System.out.println("There are " + raw_time + " seconds in " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
      
  }
}
   
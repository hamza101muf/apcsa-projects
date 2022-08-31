/*
 * Hamza Mufti (Mr. Hatcher's bfffff)
 * 08/29/22
 * 2.6 - application that converts a number of seconds into hours minutes and seconds; accuracy within +/- 1 second of
 * the actual time
 */


import java.util.Scanner;

public class Lab2_6
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    int raw_time, hours, minutes, seconds;
    
    System.out.println("5Hi, please input a time value in SECONDS, in order to get" + 
                       " how much that is in hours, minutes, and seconds");
    raw_time = scan.nextInt();
    
    hours = raw_time/3600;
    minutes = (raw_time-(hours*3600))/60;
    seconds = (raw_time-(minutes*60 + hours*3600));
    
    System.out.println("There are " + hours + " hours " + minutes + " minutes " + seconds + " seconds in "
                         + raw_time + " seconds");
    
      
  }
}
    
   
/* 
 * Hamza Mufti
 * 08/29/22
 * 2.4 - revised version of the C -> F temperature
 */
import java.util.Scanner;

public class  Lab2_4
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    double convChoice;
    double tempC, tempF;
    System.out.println("Hi, would you like to \n Convert from Celsius to Farenheit (press '1') " 
                         + "\n Convert from Farenheit to Celsius (press '2') ");
    convChoice = scan.nextInt();
    if (convChoice == 1) {
      System.out.println("OK, please input the Farenheit value you would like to input: ");
      tempF = scan.nextDouble();
      tempC = (tempF-32)/1.8;
      System.out.println("Thanks, here's your new temperature in Celsius: " + tempC);
    }
    else if (convChoice == 2) {
      System.out.println("OK, please input the Celsius value you would like to input: ");
      tempC = scan.nextDouble();
      tempF = (tempC*9/5)+32;
      System.out.println("Thanks, here's your new temperature in Farenheight: " + tempF);
    }
    else {
      System.out.println("Sorry, it looks like you didn't input an accepted value, please try again");
    }
  }
}
      
/*
 * Hamza Mufti
 * 8/31/22
 * Application that takes takes coin amounts and converts it into an actual dollar amount
 */
import java.util.Scanner;
import java.text.NumberFormat;


public class Lab2_12
{
  public static void main (String[] args)
  {
    int pennies, nickels, dimes, quarters;
    double money;
    
    try (Scanner scan = new Scanner(System.in)) {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      
      System.out.println("Please input the number of pennies you have: ");
      pennies = scan.nextInt();
      
      System.out.println("Please input the number of nickels you have: ");
      nickels = scan.nextInt();
      
      System.out.println("Please input the number of dimes you have: ");
      dimes = scan.nextInt();
      
      System.out.println("Please input the number of quarters you have: ");
      quarters = scan.nextInt();
      
      money = (pennies*.01) + (nickels*.05) + (dimes*.10) + (quarters*.25);
      
      System.out.println("Here's how much money " + quarters + " quarters, " 
      + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies is equal to: " +
       fmt.format(money));
    }
  }
}
    
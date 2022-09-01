/*
 * Hamza Mufti
 * 8/31/22
 * 2.11 - Application that computes that determines the number of miles per gallon given odometer ratings
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab2_11
{
  public static void main (String[] args)
  {
    int od1, od2;
    double totGas, mpg;
    
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat ("0.##");
    
    System.out.println("Hi, please input the STARTING ODOMETER reading below: ");
    od1 = scan.nextInt();
    
    System.out.println("Please input the FINAL ODOMETER rating below:");
    od2 = scan.nextInt();
    
    System.out.println("Please input the TOTAL GAS USED below:");
    totGas = scan.nextDouble();
    
    mpg = (od2-od1)/totGas;
    
    System.out.println("Here's the miles/gallong for your trip " + fmt.format(mpg) + " mpg");
  }
}
    
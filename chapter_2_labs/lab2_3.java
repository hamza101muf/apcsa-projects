/*
 * Hamza Mufti
 * 08/26/2022
 * 2.3 - application that reads to floating numbers and prints sum, difference, and product
*/
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class lab2_3
{
  public static void main (String[] args)
  {
    try(Scanner scan = new Scanner(System.in))
    {
    DecimalFormat fmt = new DecimalFormat("0.##");
    double num1, num2;
    double sum, prod, diff;
    System.out.println("Please enter a decimal number: ");
    num1 = scan.nextDouble();
    System.out.println("Please enter a decimal number: ");
    num2 = scan.nextDouble();
    
    sum = (num1 + num2);
    prod = (num1*num2);
    diff = (num1-num2);
    
    System.out.println(" The SUM of " + num1 + " and " + num2 +" is " + fmt.format(sum));
    System.out.println(" The PRODUCT of " + num1 + " and " + num2 + " is " + fmt.format(prod));
    System.out.println(" The DIFFERENCE between " + num1 + " and " + num2 + " is " + fmt.format((Math.abs(diff))));
    
    }
 } 
}
    
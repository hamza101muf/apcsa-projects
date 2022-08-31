/*
 * 
 * Hamza Mufti
 * 08/26/2022
 * 2.3 - application that reads to floating numbers and prints sum, difference, and product
*/
import java.util.Scanner;
import java.lang.Math;

public class lab2_3
{
  public static void main (String[] args)
  {
    try(Scanner scan = new Scanner(System.in))
    {    
    double num1, num2;
    double sum, prod, diff;
    System.out.println("Please enter a decimal number: ");
    num1 = scan.nextDouble();
    System.out.println("Please enter a decimal number: ");
    num2 = scan.nextDouble();
    
    
    sum = (num1 + num2);
    prod = (num1*num2);
    diff = (num1-num2);
    
    System.out.println(" Here's the sum of those numbers: " + sum);
    System.out.println(" Here's the product of those numbers: " + prod);
    System.out.println(" Here's the difference between those numbers: " + Math.abs(diff));
    
    }
} 
}
    
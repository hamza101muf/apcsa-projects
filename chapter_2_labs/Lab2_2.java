/*
 * Hamza Mufti
 * 08/26/22
 * 2.2 - application that reads 3 numbers and prints their average
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab2_2
{
  public static void main (String[] args)
  {
    try(Scanner scan = new Scanner(System.in))
    {
    DecimalFormat fmt = new DecimalFormat("0.###");
      
    //collects numbers
    double num0, num1, num2;
    System.out.println("Please input your first number");
    num0 = scan.nextDouble();
    System.out.println("Please input your second number");
    num1 = scan.nextDouble();
    System.out.println("Please input your third number");
    num2 = scan.nextDouble();
    
    //sums + averagas prev numbers
    double sum = num0+num1+num2;
    double avg = sum/3.0;
    
    //displays result
    System.out.println("Here's the average of " + num0 + ", " + num1 + ", " + num2 + ": ------ " + fmt.format(avg)+" ------");
    }
  }
}
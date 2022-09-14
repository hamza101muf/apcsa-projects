/*
 * Hamza Mufti
 * 08/31/22
 * 2.10 - side lengths reader to find the area of a triangle)
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab2_10
{
  public static void main (String[] args)
  {
    double s1, s2, s3, perim, area;
    
    try (Scanner scan = new Scanner(System.in)) {
      DecimalFormat fmt = new DecimalFormat ("0.###");   
      
      System.out.println("Please enter the FIRST side length of the triangle so we can calculate the area");
      s1 = scan.nextDouble();
      
      System.out.println("Please enter the SECOND side length of the triangle so we can calculate the area");
      s2 = scan.nextDouble();
      
      System.out.println("Please enter the THIRD side length of the triangle so we can calculate the area");
      s3 = scan.nextDouble();
      
      perim = (s1+s2+s3)/2;
      area = Math.sqrt(perim*(perim-s1)*(perim-s2)*(perim-s3));
      
      
      System.out.println("The area of your triangle (with side lengths: " 
      + s1 + ", " + s2 + ", " + s3 + ") is " + fmt.format(area) + " units squared");
    }

  }
}
/* 
 * Hamza Mufti
 * 08/31/22
 * 2.8 - Application that computes the distance between two points
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab2_8
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat ("0.###");
    
    double x1, x2, y1, y2, distance;
    
    System.out.println("Hi, please input two coordinates below so we can find the distance between them! \n" + 
    "\t Let's start out with the X-COORDINATE for your 1ST POINT: ");
    x1 = scan.nextDouble();
    
    System.out.println("Now let's go with the Y-COORDINATE for your 1ST POINT");
    y1 = scan.nextDouble();
    
    System.out.println("Now let's go with the X-COORDINATE for your 2ND POINT");
    x2 = scan.nextDouble();
    
    System.out.println("Now let's go with the Y-COORDINATE for your 2ND POINT");
    y2 = scan.nextDouble();
    
    distance = Math.sqrt((Math.pow((x2-x1), 2) + (Math.pow((y2-y1), 2))));
    
    System.out.println("Here's the distance between those two points: " + fmt.format(distance) + " units");
    
  }
}
    
    
/*
 * Authour: Hamza Mufti
 * 08/31/22
 * 
 * 2.9 - application that reads the radius of a sphere and print volume and surface area
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab2_9
{
  public static void main(String[] args)
  {
    try (Scanner scan = new Scanner(System.in)) {
      DecimalFormat fmt = new DecimalFormat ("0.##");
      
      double radius, surfArea, volume;
      
      System.out.println("Hi, please input a RADIUS measure of a sphere so we can get its volume and surface area: ");
      radius = scan.nextDouble();
      
      surfArea = (4/3)*(Math.PI)*(Math.pow(radius, 3));
      volume = 4*(Math.PI)*(Math.pow(radius, 2));
      
      System.out.println("Here's the volume: " + fmt.format(volume) 
      + " cubic units and the Surface Area: " + fmt.format(surfArea)+ " square units");
    }
                 
  }
}
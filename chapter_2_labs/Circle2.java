//**********************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
//**********************************************************
import java.text.DecimalFormat;

public class Circle2
{
    public static void main(String[] args)
    {
       DecimalFormat fmt = new DecimalFormat("0.##");
       final double PI = 3.14159;
     
       int radius = 10;
       double area = PI * radius * radius;
       double circum = 2*PI*radius;

       System.out.println("The area of a circle with radius " + radius +
                        " is " + fmt.format(area));
       System.out.println("The circumference of a circle with radius " + radius +
                        " is " + fmt.format(circum));

       int radius1 = 20;
       double area1 = PI * radius1 * radius1;
       double circum1 = 2*PI*radius1;

       System.out.println("The area of a circle with radius " + radius1 +
                        " is " + fmt.format(area1));
       System.out.println("The circumference of a circle with radius " + radius1 +
                        " is " + fmt.format(circum1));
       
       double aScaleFactor = area1/area;
       double cScaleFactor = circum1/circum;
       System.out.println("The scale factor between a circle with radius " + radius + ", area " + fmt.format(area)
                            + ", circumference " + fmt.format(circum) + " AND another circle with radius " + radius1
                            + ", area " + fmt.format(area1) + ", and circumference " + fmt.format(circum1) 
                            + ", IS \n " + aScaleFactor
                            + " for the area \n " + cScaleFactor + " for the circumference");
       
    }
}

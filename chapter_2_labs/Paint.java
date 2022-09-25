
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;

public class Paint {
    public static void main(String[] args) {
            final int COVERAGE = 350; // paint covers 350 sq ft/gal
            int length, width, height, doors, windows;
            double totalSqft, paintNeeded;
            boolean programRun = true;

            Scanner scan = new Scanner(System.in);
            DecimalFormat fmt = new DecimalFormat("0.##");

            while (programRun == true){

            // Prompt for and read in the length of the room
            System.out.println("Please enter the length of your room\n");
            length = scan.nextInt();

            System.out.println("Please enter the width of your room\n");
            width = scan.nextInt();

            System.out.println("Please enter the height of your room\n");
            height = scan.nextInt();

            System.out.println("Please enter the number of windows of your room\n");
            windows = scan.nextInt();

            System.out.println("Please enter the number of doors in your room\n");
            doors = scan.nextInt();

            totalSqft = (2 * width * height) + (2 * length * height);
            totalSqft = totalSqft - (20 * doors) - (15 * windows);
            // gets total sqft for the walls

            // Compute the amount of paint needed
            paintNeeded = totalSqft / COVERAGE; //NOT INT DIVISION --> totalSqft = double

            // Print the length, width, and height of the room and the
            // number of gallons of paint needed.

            System.out.println("For a room with length " + length + ", width " +
                    width + ", and height " + height + ", but you have " + doors
                    + " doors and " + windows + " windows, so you will only need "
                    + fmt.format(paintNeeded) + " gallons of paint.");
            System.out.println("Would you like to convert another number\n\t \'true\' for yes \n\t \'false\' for no");
                    programRun = scan.nextBoolean();
                }


            scan.close();

        }
}

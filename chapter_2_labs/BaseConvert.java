// ************************************************
//   BaseConvert.java
//
//   Converts base 10 numbers to another base
//   (at most 4 digits in the other base).  The
//   base 10 number and the base are input.
// ************************************************

import java.util.Scanner;

public class BaseConvert
{
   public static void main (String[] args)
   {
      boolean programRun = true;
     
      int base;        // the new base
      int base10Num;   // the number in base 10
      int maxNumber;   // the maximum number that will fit
                       // in 4 digits in the new base

      int place0;      // digit in the 1's (base^0) place
      int place1;      // digit in the base^1 place
      int place2;      // digit in the base^2 place
      int place3;      // digit in the base^3 place

      String baseBNum = new String (""); // the number in the new base
      Scanner scan = new Scanner(System.in);
      
      while (programRun == true) {
        // read in the base 10 number and the base
        System.out.println();
        System.out.println ("Base Conversion Program");
        System.out.println();
        System.out.print ("Please enter a base (2 - 9): ");  
        base = scan.nextInt();
        
        maxNumber = (int)(Math.pow(base, 4)-1);
        System.out.println("The max base-10 value that you can convert (for a number with base " + base + "), is " +
                           maxNumber);
        
        System.out.print ("Please enter a base 10 number to convert: ");
        base10Num = scan.nextInt();
        
        // Do the conversion (see notes in lab)
        place0 = base10Num%base;
        place1 = (base10Num/base)%base;
        place2 = (base10Num/(base*base))%base;
        place3 = (base10Num/(base*base*base))%base;
        
        baseBNum = ("" + place3 + place2 + place1 + place0);
        
        // Print the result (see notes in lab)
        System.out.println("Here is " + base10Num + " as number with base " + base + ": " + baseBNum );
        System.out.println("Would you like to convert another number\n\t \'true\' for yes \n\t \'false\' for no");
        programRun = scan.nextBoolean();
    }
      scan.close();
   }
}

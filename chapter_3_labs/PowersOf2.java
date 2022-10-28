// ****************************************************************

// PowersOf2.java

// Print out as many powers of 2 as the user requests

// ****************************************************************

import java.util.Scanner;

public class PowersOf2 {
    public static void main(String[] args) {

        int numPowersOf2; // How many powers of 2 to compute
        int nextPowerOf2 = 1; // Current power of 2
        int exponent = 0; // Exponent for current power of 2, this also serves as a counter for the loop
        Scanner scan = new Scanner(System.in);

        System.out.print("How many powers of 2 do you want (up to 30): ");

        numPowersOf2 = scan.nextInt();

        // print a message saying how many powers of 2 will be printed

        // initialize exp.,the first thing printed is 2 to the what?
        System.out.println("Here are the first " + numPowersOf2 + " powers of 2");
        while (exponent < numPowersOf2) {
            // print out current power of 2
            System.out.println("2^" + exponent + " = " + nextPowerOf2);
            // find next power of 2 -- how do you get this from last?
            nextPowerOf2 *= 2;
            // increment exponent
            exponent++;
        }

        scan.close();

    }
}
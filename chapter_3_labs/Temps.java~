
// **********************************************************
// Temps.java
//
// This program reads in a sequence of hourly temperature
// readings (beginning with midnight) and prints the maximum
// temperature (along with the hour, on a 24-hour clock, it
// occurred) and the minimum temperature (along with the hour
// it occurred).
// *********************************************************
import java.util.Scanner;

public class Temps {
    // ----------------------------------------------------
    // Reads in a sequence of temperatures and finds the
    // maximum and minimum read in.
    // ----------------------------------------------------
    public static void main(String[] args) {

        final int HOURS_PER_DAY = 24;
        int maxTemp, minTemp, timeOfMax=0, timeOfMin=0, temp = 0; // a temperature reading
        maxTemp = Integer.MIN_VALUE;
        minTemp = Integer.MAX_VALUE;
        Scanner scan = new Scanner(System.in);
        // print program heading

        System.out.println();
        System.out.println("Temperature Readings for 24 Hour" + " Period");
        System.out.println();

        for (int hour = 0; hour < HOURS_PER_DAY; hour++) {
            System.out.print("Enter the temperature reading at " + hour + " hours: ");
            temp = scan.nextInt();
            if (temp > maxTemp) {
                maxTemp = temp;
                timeOfMax = hour;
            }
            if (temp < minTemp) {
                minTemp = temp;
                timeOfMin = hour;
            }
        }

        if ((timeOfMax <=9)&&(timeOfMin <=9)) {
            System.out.println("The maximum temperature is " + maxTemp + " which occured at 0" + timeOfMax + "00 hours");
            System.out.println("The minimum temperature is " + minTemp + " which occured at 0" + timeOfMin + "00 hours");
        }
        else if (timeOfMin <=9){
            System.out.println("The maximum temperature is " + maxTemp + " which occured at " + timeOfMax + "00 hours");
            System.out.println("The minimum temperature is " + minTemp + " which occured at 0" + timeOfMin + "00 hours");
        }
        else if (timeOfMax <=9){
            System.out.println("The maximum temperature is " + maxTemp + " which occured at 0" + timeOfMax + "00 hours");
            System.out.println("The minimum temperature is " + minTemp + " which occured at " + timeOfMin + "00 hours");
        }
        else {  
            System.out.println("The maximum temperature is " + maxTemp + " which occured at " + timeOfMax + "00 hours");
            System.out.println("The minimum temperature is " + minTemp + " which occured at " + timeOfMin + "00 hours");
        }

        scan.close();
    }
}
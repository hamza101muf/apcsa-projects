/*
 * Hamza Mufti
 * Ideal Weight Program - calculates the ideal weight based on height
 * 9/15/2022
 */
import  java.util.Scanner;
import java.text.DecimalFormat;

public class IdealHeight
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("0.##");
    
    int weightF, weightM, heightFt, heightIn;
    double lowRangeF, highRangeF, lowRangeM, highRangeM;
    
    System.out.println("Please input your height in feet (ex. if you are 5'6\" then input \'5\'): ");
    heightFt = scan.nextInt();
    
    System.out.println("Thanks, now input the height in inches (if you are 5'6\" then input \'6\')");
    heightIn = scan.nextInt();
    
    weightF = 100 + 5*((heightFt*12+heightIn)-60);
    weightM = 106 + 6*((heightFt*12+heightIn)-60);
    
    lowRangeF = 0.85*weightF;
    highRangeF = 1.15*weightF;
    lowRangeM = 0.85*weightM;
    highRangeM = 1.15*weightM;
    
    
    System.out.println("If you are a FEMALE, then your ideal weight would be " + weightF + "lbs for a height of "
                         + heightFt + "\'" + heightIn + "\"" + " with a range of " + fmt.format(lowRangeF) 
                         + " - " + fmt.format(highRangeF) + "lbs");
    System.out.println("If you are a MALE, then your ideal weight would be " + weightM + "lbs for a height of " 
                         + heightFt + "\'" + heightIn + "\"" + " with a range of " + fmt.format(lowRangeM) 
                         + " - " + fmt.format(highRangeM) + "lbs");
    
    scan.close();
  }
}
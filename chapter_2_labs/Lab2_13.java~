/* 
 * Hamza Mufti
 * 08/31/22
 * 2.13 - random phone number generator (first 3 can't have 8 or 9), second set can't have value greater than 742 
 */
import java.text.DecimalFormat;

public class Lab2_13
{
  public static void main (String[] args)
  {
    DecimalFormat fmt4 = new DecimalFormat("0000");
    DecimalFormat fmt3 = new DecimalFormat("000");
    // understand the logic behind this, Random specifies the type of object being created
    // then stores it in 'gen' then assigns it to a new object holding that method
    String test1;
    double test2, test3;
    
//    phone1 = ("(" + rand.nextInt(8) + rand.nextInt(8) + rand.nextInt(8) + ")");
//    phone2 = ("-" + rand.nextInt(7) + rand.nextInt(4) + rand.nextInt(2) + "-");
//    phone3 = ("" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10));
    
    test1 = ("("+(int)(Math.random()*8)+(int)(Math.random()*8)+(int)(Math.random()*8)+")-");
    test2 = ((int)(Math.random()*742));
    test3 = ((int)(Math.random()*1000));
    
//    System.out.println("Here's a random phone number: " + phone1+phone2+phone3);
    System.out.println("Here's a random phone number: " + test1 + fmt3.format(test2) +"-"+fmt4.format(test3));
    
    

    
  }
}
/* 
 * Hamza Mufti
 * 08/31/22
 * 2.13 - random phone number generator (first 3 can't have 8 or 9), second set can't have value greater than 742
 */
import java.util.Random;

public class Lab2_13
{
  public static void main (String[] args)
  {
    Random rand = new Random(); 
    // understand the logic behind this, Random specifies the type of object being created
    // then stores it in 'gen' then assigns it to a new object holding that method
    String phone1, phone2, phone3;
    
    phone1 = ("(" + rand.nextInt(8) + rand.nextInt(8) + rand.nextInt(8) + ")");
    phone2 = ("-" + rand.nextInt(7) + rand.nextInt(4) + rand.nextInt(2) + "-");
    phone3 = ("" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10));
    
    System.out.println("Here's a random phone number: " + phone1+phone2+phone3);
    
    

    
  }
}
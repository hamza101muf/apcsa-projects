/* 
 * Lab 6.3 - Reversing an Array
 * Hamza Mufti - 1/5
*/
import java.util.*;

public class Lab_6_3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("How many numbers would you like to enter: ");
    int[] koala = new int[scan.nextInt()];
    
    for (int i=0;i<koala.length;i++) {
      System.out.println("Please enter number " + (i+1));
      koala[i] = scan.nextInt();
    }
    for (int i=0;i<koala.length/2;i++) {
        int temp = koala[i];
        koala[i]=koala[koala.length-1-i];
        koala[koala.length-1-i]=temp;
    }
    for (int i=0;i<koala.length;i++) {
    System.out.print(koala[i]+",");
    } 
    scan.close();
  } 
}
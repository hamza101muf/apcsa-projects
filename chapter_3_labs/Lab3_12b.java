/*
 * Hamza Mufti
 * Lab 3.12b - stars program in certain arrangement
 */

public class Lab3_12b {
  public static void main(String[] args) {
    
    for(int i = 10; i>=1; i--) {
      for(int j = i; j>=1;j--)
        System.out.print(" ");
      for(int j = i;j<=10;j++)
        System.out.print("*");
         
      System.out.println();
      
    }
    
  }
}
    
/*
 * Hamza Mufti
 * Lab 3.12c - stars program in certain arrangement
 */

public class Lab3_12c {
  public static void main(String[] args) {
    
    for(int i = 1; i<=10; i++) {
      for(int j = i; j>=1;j--)
        System.out.print(" ");
      for(int j = i;j<=10;j++)
        System.out.print("*");
      System.out.println();
      
    }
    
  }
}
    
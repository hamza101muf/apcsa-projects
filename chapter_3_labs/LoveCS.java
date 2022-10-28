// ****************************************************************
// LoveCS.java
// Use a while loop to print many messages declaring your
// passion for computer science
// ****************************************************************

import java.util.Scanner;

public class LoveCS {

  public static void main(String[] args) {

    int limit;
    int count = 0;
    int sum = 0;

    Scanner scan = new Scanner(System.in);
    System.out.print("Hi, please input the number of times you would like the statement to print: ");

    limit = scan.nextInt();

    while (count < limit) {
      System.out.println(count + 1 + " I love Computer Science!!");
      count++;
      sum += count;
    }
    System.out.println("Printed this message " + count + " times." + " The sum of the numbers " 
    + "1 to " + (count) +" is " + sum + ".");

    scan.close();
  }

}
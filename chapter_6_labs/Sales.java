
// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;
import java.text.NumberFormat;

public class Sales {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    int amnt = 0;
    int maxSale = Integer.MIN_VALUE;
    int minSale = Integer.MAX_VALUE;
    int empHigh = 0;
    int empLow = 0;
    System.out.print("How many employees do you have: ");
    int salesPeople = scan.nextInt();
    int[] sales = new int[salesPeople];
    int sum;

    for (int i = 0; i < sales.length; i++) {
      System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
      sales[i] = scan.nextInt();
    }
    System.out.println("\nSalesperson Sales");
    System.out.println("--------------------");
    sum = 0;
    for (int i = 0; i < sales.length; i++) {
      System.out.println("Employee " + (i + 1) + " -- $" + sales[i]);
      sum += sales[i];
      if (sales[i] < minSale) {
        minSale = sales[i];
        empLow = i + 1;
      }
      if (sales[i] > maxSale) {
        maxSale = sales[i];
        empHigh = i + 1;
      }
    }
    System.out.println("\nTotal sales: " + fmt.format(sum));
    System.out.println("\nAverage Sale: " + fmt.format(sum / (double) salesPeople));
    System.out.println("\nEmployee " + empHigh + " had the highest sale of " + fmt.format(maxSale));
    System.out.println("\nEmployee " + empLow + " had the lowest sale of " + fmt.format(minSale));

    System.out.print("\nEnter an amount to see how other employees compare: ");
    amnt = scan.nextInt();
    int totHi = 0;
    int totLo = 0;
    for (int i = 0; i < sales.length; i++) {
      if (sales[i] > amnt) {
        System.out.println("--------------\nEmployee " 
        + (i + 1) + " (" + fmt.format(sales[i]) + ") sold more than "
            + fmt.format(amnt) + " by " + fmt.format(sales[i] - amnt));
        totHi++;
      } else if (sales[i] == amnt)
        System.out
            .println("--------------\nEmployee " 
            + (i + 1) + " (" + fmt.format(sales[i]) + ") sold exactly " + fmt.format(amnt));
      else {
        System.out.println("--------------\nEmployee " 
        + (i + 1) + " (" + fmt.format(sales[i]) + ") sold less than "
            + fmt.format(amnt) + " by " + fmt.format(amnt - sales[i]));
        totLo++;
      }
    }
    System.out.println("\n" + totHi + " employees sold more than " + fmt.format(amnt));
    System.out.println("\n" + totLo + " employees sold less than " + fmt.format(amnt));
    scan.close();
  }
}
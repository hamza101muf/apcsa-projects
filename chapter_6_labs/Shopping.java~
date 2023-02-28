/*
 * Hamza Mufti
 * Runner program for Shopping Cart WITH ARRAYS
 * 1/23/2023
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class Shopping {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String cont = "y";
    ShoppingCart cart = new ShoppingCart();
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    while (cont.equalsIgnoreCase("y")) {
      System.out.print("What is the name of the item you would like to buy: ");
      String name = scan.next();
      System.out.print("What is the price of the item you would like to buy: ");
      double price = scan.nextDouble();
      System.out.print("How many of the item you would like to buy: ");
      int quantity = scan.nextInt();
      
      
      cart.addToCart(name, quantity, price);
      System.out.println(cart);
      
      System.out.print("Would you like to continue shopping? (y/n): ");
      cont = scan.next();
    }
    System.out.println("Please pay: " + fmt.format(cart.getTotalPrice()));
    scan.close();
  }
}
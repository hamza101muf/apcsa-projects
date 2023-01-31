
// ***************************************************************
// Shop.java
//
// Uses the Item class to create items and add them to a shopping
// cart stored in an ArrayList.
// ***************************************************************
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

public class Shop {
    public static void main(String[] args) {
        String itemName;
        double itemPrice;
        int quantity;
        double totalPrice=0;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        ArrayList <Item> cart = new ArrayList <Item>();
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        while (keepShopping.equals("y")) {
            System.out.print("Enter the name of the item: ");
            itemName = scan.next();
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            totalPrice += (itemPrice*(double)quantity);
            // *** create a new item and add it to the cart
            cart.add(new Item(itemName, itemPrice, quantity));
            // *** print the contents of the cart object using println
            System.out.println("Name\tQuantity\tPrice\tTotal");
            for (int i=0;i<cart.size();i++) {
                System.out.println(cart.get(i).toString());
            }
            System.out.println("Your current total bill is " + fmt.format(totalPrice));
            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.next();
        }
        
        /*for (int i=0;i<cart.size();i++) {
            totalPrice += (cart.get(i).getPrice()*(double)(cart.get(i).getQuantity()));
        }*/
        System.out.println("Your total bill is " + fmt.format(totalPrice));

        scan.close();

    }

}
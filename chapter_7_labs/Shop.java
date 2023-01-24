
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
        int totalPrice=0;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        ArrayList <Item> cart = new ArrayList <Item>();
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.next();
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            cart.add(new Item(itemName, itemPrice, quantity));
            // *** print the contents of the cart object using println
            System.out.println(cart);
            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.next();
        }
        while (keepShopping.equals("y"));
        for (int i=0;i<cart.size();i++) {
            totalPrice += cart.get(i).getPrice();
        }
        System.out.println("Your total bill is " + fmt.format(totalPrice));

        scan.close();

    }

}
/* 
 * Hamza Mufti
 * 1/19/23
 * Shopping cart Array lab - Shopping Cart Class File
 */
import java.text.NumberFormat;

public class ShoppingCart {
  private int capacity;
  private Item[] cart;
  private int itemCount;
  private double totalPrice;

  NumberFormat fmt = NumberFormat.getCurrencyInstance();
 
  public ShoppingCart() {
    capacity = 5;
    cart=new Item[capacity];
    itemCount=0;
    totalPrice = 0;
  }
  public double getTotalPrice() {
    return totalPrice;
  }
  private Item[] increaseSize() {
    capacity +=3;
    Item[] temp = new Item[capacity];
    for (int i=0;i<capacity-3;i++)
      temp[i]=cart[i];
    cart=temp;
    return cart;
  }
  public void addToCart(String itmnm, int qnty, double pricing) {
    if (itemCount == capacity)
      increaseSize();
    Item turtle = new Item(itmnm, pricing, qnty);
    cart[itemCount] = turtle;
    itemCount++;
    totalPrice += qnty*pricing;
  }
  
  public String toString() {
    String report = "Name\tQuantity\tPrice\tTotal\n";
    for (int i=0;i<itemCount;i++) {
      report += cart[i];
    }
    return(report + "\nTotal Price of Cart: " + fmt.format(totalPrice));
    
  }
  
}
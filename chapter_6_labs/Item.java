/* 
 * Hamza Mufti
 * 1/19/23
 * Shopping cart Array lab - item class file
 */
import java.text.NumberFormat;

public class Item {
 private String itmName;
 private double price;
 private int quantity;
 
 NumberFormat fmt = NumberFormat.getCurrencyInstance();
 
 public Item(String itm, double prc, int qn) {
   itmName = itm;
   price = prc;
   quantity = qn;
 }
 
 public String getItemName() {
   return itmName;
 }
 public double getPrice() {
   return price;
 }
 public int getQuantity() {
   return quantity;
 }
 
 public String toString() {
   return( itmName  + "\t" + quantity + "\t" + fmt.format(price)+ "\t" + fmt.format(price*quantity)+"\n");
 }
}
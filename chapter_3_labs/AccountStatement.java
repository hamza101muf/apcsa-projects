/*
 * Hamza Mufti
 * Calculates he monthly charge amount and balance of a customer credit card
 * 9/26/22
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class AccountStatement { 
  public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    double prev_bal, add_charges, interest, min_payment, new_bal;
    
    System.out.println("      Balance Sheet\n\nPlease input the previous balance for the month "
                      + "(ex. if you owed $30, then enter \'30\')");
    prev_bal = scan.nextDouble();
    
    System.out.println("Thanks, now input the amount of additional charges for the month");
    add_charges = scan.nextDouble();
    
    if (prev_bal > 0) {
      interest = (prev_bal + add_charges)*0.02;
      new_bal = prev_bal+add_charges+interest;
    }
    else{
      interest = 0;
      new_bal = add_charges;
    }
    if (new_bal <50)
      min_payment = new_bal;
    else if (new_bal <= 300)
      min_payment = 50.00;
    else
      min_payment = 0.2*new_bal;
    
    System.out.println("CS CARD International Statement\n===============================\n");
    System.out.println("Previous Balance: " + fmt.format(prev_bal));
    System.out.println("Additional Charges: " + fmt.format(add_charges));
    System.out.println("Interest: " + fmt.format(interest));
    System.out.println("===========================\nNew Balance: " + fmt.format(new_bal));
    System.out.println("Minimum Payment: " + fmt.format(min_payment));

    scan.close();
  
    
  }
}
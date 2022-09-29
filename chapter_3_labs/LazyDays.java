/* 
 * Hamza Mufti
 * Program that uses if-else statements to sugest activities based on weather
 * 9/27/22
 */
import java.util.Scanner;

public class LazyDays {
  public static void main(String[] args) {
    int temp;
    String activity;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Hi, please input an INTEGER temperature in Farienheit"
                         + "so we can help you choose what to do today");
    temp = scan.nextInt();
    if ((temp > 95) || (temp < 20))
      activity = "let's go visit our shops!";
    else if (temp >= 80)
      activity = "let's go swimming today!";
    else if (60 <= temp)
      activity = "let's go play some tennis";
    else if (40 <= temp)
      activity = "let's go play some golf";
    else
      activity = "let's go skiing";
  

    System.out.println("Since it is " + temp + " degrees outside " + activity);
    scan.close();

  }
  
}
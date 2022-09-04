/*
// Hamza Mufti
// 08/23/2022
// 2nd program, basic outputs for names, movie, etc (fav movie is NOT a MARVEL movie)
*/
import java.util.Scanner;

public class Lab1_3

{
  public static void main (String[] args)
  {
    try (Scanner scan = new Scanner(System.in)) {
      String first, last, bday, book, movie;
      System.out.println("Enter your first name: ");
      first = scan.next();
      
      System.out.println("Enter your last name: ");
      last = scan.next();
      
      System.out.println("Enter your birthday: ");
      bday = scan.next();
      
      System.out.println("Enter your favorite book: ");
      book = scan.next();
      
      System.out.println("Enter your favorite movie: ");
      movie = scan.next();
      
      System.out.println(" Name: " + first + " " + last + "\n " + "Birthday: " + bday + "\n " + "Favorite Book: " +
                         book + " \n " + "Favorite Movie: " + movie);
    } 
    
    
    /*System.out.println("Name: " + name);
    System.out.println("Birthday: " + bday);
    System.out.println("Favorite Movie: " + movie);
    System.out.println("Hobbies: Fishing with turtles, eating food, breathing");
    System.out.println("Favorite Book: The Tapestry");*/

  }
}
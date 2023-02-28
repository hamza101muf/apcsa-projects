// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if
// each square is magic.
//
// ****************************************************************
import java.util.Scanner;
import java.io.*;
public class SquareTest
{
  public static void main(String[] args) throws IOException
  {
    Scanner scan = new Scanner(new File("magicData.txt"));
    int count = 1; //count which square we're on
    int size = scan.nextInt(); //size of next square
//Expecting -1 at bottom of input file
    while (size != -1)
    {
//create a new Square of the given size
      Square turtle = new Square(size);
//call its read method to read the values of the square
      turtle.readSquare(scan);
      System.out.println("\n******** Square " + count + " ********");
//print the square
      turtle.printSquare();
//print the sums of its rows
      for (int i=0;i<size;i++)
        System.out.println("Sum of Row " + (i+1)+": " + turtle.sumRow(i));
//print the sums of its columns
      for (int i=0;i<size;i++)
        System.out.println("Sum of Column " + (i+1) +": " + turtle.sumCol(i));
//print the sum of the main diagonal
        System.out.println("Sum Main Diag: " + turtle.sumMainDiag());
//print the sum of the other diagonal
        System.out.println("Sum Alt Diag: " +turtle.sumOtherDiag());
//determine and print whether it is a magic square
      System.out.println("This is a magic square: "+turtle.magic());
//get size of next square
      count++;
      size = scan.nextInt();
    }
  }
}
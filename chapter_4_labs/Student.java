
// ****************************************************************
// Student.java
//
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student�s info.
// ****************************************************************
import java.util.Scanner;

public class Student {
  // declare instance data
  private String name;
  private int scoreTest1;
  private int scoreTest2;

  // -----------------------------------------------
  // constructor
  // -----------------------------------------------
  public Student(String studentName) {
    name = studentName;
  }

  // -----------------------------------------------
  // inputGrades: prompt for and read in student's grades for test1 and test2.
  Scanner scan = new Scanner(System.in);

  // Use name in prompts, e.g., "Enter's Joe's score for test1".
  // -----------------------------------------------
  public void inputGrades() {
    System.out.println("Please input " + name + "\'s score for test 1: ");
    scoreTest1 = scan.nextInt();
    System.out.println("Please input " + name + "\'s score for test 2: ");
    scoreTest2 = scan.nextInt();
  }

  // -----------------------------------------------
  // getAverage: compute and return the student's test average
  // -----------------------------------------------
  public double getAverage() {
    return ((scoreTest1 + scoreTest2) / 2.0);
  }

  // -----------------------------------------------
  // getName: print the student's name
  // ----------------------------------------------
  public String getName() {
    return (name);
  }

  public String toString() {
    return ("Name: " + name + " || Test 1: " + scoreTest1 + " || Test 2: " + scoreTest2);
  }
}
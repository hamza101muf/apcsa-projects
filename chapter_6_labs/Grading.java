import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numQs;
        boolean moreQuizzes = true;
        int numPassing = 0;
        
        System.out.print("Enter the number of questions on the quiz: ");
        numQs = scan.nextInt();
        int[] key = new int[numQs];

        for (int i = 0; i < numQs; i++) {
            System.out.print("Enter the answer for question " + (i + 1) + ": ");
            key[i] = scan.nextInt();
        }
        while (moreQuizzes) {
            int correct=0;
            int incorrect=0;
            for (int i = 0; i < numQs; i++) {
                System.out.print("Enter the student's answer from question " + (i + 1) + ": ");
                if (scan.nextInt() == key[i]) {
                    System.out.println("Correct");
                    correct++;
                } else {
                    System.out.println("Incorrect");
                    incorrect++;
                }
            }
            System.out.println("The person got " + correct + " questions correct and " + incorrect + " questions incorrect.");
            System.out.println("The quiz score is " + correct/(double)numQs*100.0 + "% ");
            if (correct/(double)numQs*100.0 >= 70.0) {
                System.out.println("The student passed the quiz.");
                numPassing++;
                System.out.println("The number of students passing is " + numPassing + ".");
            } else {
                System.out.println("The student failed the quiz.");
            }

            System.out.print("Do you have another quiz to grade? (y/n): ");
            if (scan.next().equals("n")) {
                moreQuizzes = false;
            }
        }


        scan.close();
        }
    }
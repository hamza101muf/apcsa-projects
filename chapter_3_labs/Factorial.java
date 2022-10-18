/*
 * Hamza Mufti
 * Factorial - find the factorial for a given non-zero integer
 * 10/18/22
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;
        int factorial = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi, please input an INTEGER so we can calculate the factorial of that number");
        num = scan.nextInt();
        while (num < 0)
        {
            System.out.println("Please input a non-negative integer");
            num = scan.nextInt();
        }
        while (num > 0) {
            factorial *= num;
            num--;
        }
        
        System.out.println("The factorial of your number is " + factorial);
        scan.close();
    }
}

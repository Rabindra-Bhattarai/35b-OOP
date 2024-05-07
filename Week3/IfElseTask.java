package Week3;
import java.util.Scanner;

public class IfElseTask {
    /*Task 1
         * consider the following marketing
         * calculate the total and average in a variable
         * if any of the marketing is leess than 35, print fail
         * if avg is less than 60, print third div
         * if avg is less than 70, print second div
         * if avg is less than 80, print first div
         * if avg is equal or greater than 80, print distinction
         * if avg is less than 0 or more than 100, print invalid
         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your total: ");
        int total = scanner.nextInt();
        
        if (total < 0 || total > 100) {
            System.out.println("Invalid");
        } else if (total < 35) {
            System.out.println("Fail");
        } else if (total < 60) {
            System.out.println("Third div");
        } else if (total < 70) {
            System.out.println("Second div");
        } else if (total < 80) {
            System.out.println("First div");
        } else {
            System.out.println("Distinction");
        }
        
        scanner.close();
    }
}


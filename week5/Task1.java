package week5;
import java.util.Scanner;

/* task
 * prompt user to enter a number
 * runlopp and ask user the interger until
 * interger is negative
 */

public class Task1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int inputInt = scan.nextInt();
       while (inputInt >= 0) {
           System.out.println("Enter a number: ");
           inputInt = scan.nextInt();
       }
       System.out.println("It is a negative number" + inputInt);
       scan.close();
        
    }
    
}

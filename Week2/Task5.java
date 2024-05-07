import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
         /* Task
         * make a new scanner object/variable scan
         * prompt the follwoin g 
         * What is yourr name? -> save as string, name
         * Are you over 18? -> save as boolean, status
         * how many siblings? -> save as int, siblings
         * print the following
         * Hello, name
         * over 18? status
         * you have siblings num of siblings
         * //comment the previous scanner for ease of use
         */


         Scanner scan1 = new Scanner(System.in);
         System.out.println("What is your name?");
         String name =scan1.nextLine();
         System.out.println("Are you over 18?");
         boolean status = scan1.nextBoolean();
         System.out.println("How many siblings do you have?");
         int siblings = scan1.nextInt();
 
 
         System.out.println("Hello "+ name);
         System.out.println("Over 18?" + status);
         System.out.println("You have " + siblings + " siblings");
         scan1.close();
 
    }
    
}

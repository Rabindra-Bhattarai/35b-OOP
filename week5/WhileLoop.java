package week5;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int count =0;
        while(count<3){
            System.out.println("While count: "+count);
            ++count;
        }
        /* When using while with variable, increment and decrement 
         * Are done inside the loop
        */

        /*The main use of while is when  you do not know how many time the loop to 
         * iterate, for E.g:- Asking user for a number until same condition
         * is match, like 0-100
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease insert a number");
        int inputInt = scan.nextInt();
        while(inputInt<0 || inputInt > 100){
            System.out.println("Number between 0-100 only");
            inputInt = scan.nextInt();
        }
        System.out.println("Condition Matched: "+inputInt);
        scan.close();
    }

    
}


//import java.net.SocketPermission;
import java.util.Scanner;
/* 
 * or use
 * import java.util.*; //import all utils
*/



public class InputOutput {
    public static void main(String[] args) {
        /*User output
         * System.out.println("Print next line")
         * "sout" for shortcut
         */
        System.out.println("This string break line");
        /*SYstem.out.print */
        System.out.print("This is will not break line");
        System.out.print("This is will continue");
        /*System.out.printf
         * String formatter
         * %s String, %d integer, %f float, %b boolean
         */
        System.out.printf(" Hello %s, Nice", "World");
        System.out.printf(" This is num %d", 10); 
        /* you can use multiple formate */
        System.out.printf("Num %f and bool %b", 10.3f, false);

        /* USer Imput */
        Scanner scan  = new Scanner(System.in);
        System.out.println(" The folllowing takes whole sentence");
        String wholeWString = scan.nextLine();
        System.out.println("The input is " + wholeWString);
        System.out.println(" The folllowing takes integer");    
        int intInput = scan.nextInt();
        System.out.println("The input is "+ intInput);
        System.out.println(" The folllowing takes double");    
        double doubleInput = scan.nextDouble();
        System.out.println("The input is "+ doubleInput);
        System.out.println("The following boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("The input is "+ booleanInput);
        scan.close(); // close after taking all the input

       
    }
}

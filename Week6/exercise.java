package Week6;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter your Second Phone number");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;

        System.out.println("The total number is: "+ sum);

        scanner.close();



        
    }
    
}

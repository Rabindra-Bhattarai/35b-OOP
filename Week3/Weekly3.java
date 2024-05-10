package Week3;
import java.util.Scanner;

public class Weekly3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Find the maximum between three numbers
        System.out.print("Enter three numbers separated by spaces: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
        System.out.println("Maximum number: " + max);

        // 2. Check whether a number is negative, positive, or zero
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String sign = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println("The number is " + sign);

        // 3. Check whether a number is divisible by 5 and 11 or not
        System.out.print("Enter a number to check divisibility by 5 and 11: ");
        int numDivisible = scanner.nextInt();
        boolean divisible = (numDivisible % 5 == 0 && numDivisible % 11 == 0);
        System.out.println("Is the number divisible by 5 and 11? " + divisible);

        // 4. Check whether a number is even or odd
        System.out.print("Enter a number to check even or odd: ");
        int numEvenOdd = scanner.nextInt();
        String evenOdd = (numEvenOdd % 2 == 0) ? "even" : "odd";
        System.out.println("The number is " + evenOdd);

        // 5. Check whether a year is a leap year or not
        System.out.print("Enter a year to check leap year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("Is the year a leap year? " + isLeapYear);

        // 6. Check whether an alphabet is a vowel or consonant
        System.out.print("Enter an alphabet to check vowel or consonant: ");
        char alphabet = scanner.next().charAt(0);
        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel.");
                break;
            default:
                System.out.println("It is a consonant.");
        }

        // Switch case statements questions

        // 1. Convert student's grade to GPA
        System.out.print("Enter student's grade (A, B, C, D, or F): ");
        char grade = scanner.next().charAt(0);
        double gpa;
        switch (grade) {
            case 'A':
                gpa = 4.0;
                break;
            case 'B':
                gpa = 3.0;
                break;
            case 'C':
                gpa = 2.0;
                break;
            case 'D':
                gpa = 1.0;
                break;
            case 'F':
                gpa = 0.0;
                break;
            default:
                gpa = -1.0; // Invalid grade
        }
        if (gpa != -1.0) {
            System.out.println("GPA: " + gpa);
        } else {
            System.out.println("Invalid grade entered.");

        // Close the scanner
        scanner.close();
    }
}
}
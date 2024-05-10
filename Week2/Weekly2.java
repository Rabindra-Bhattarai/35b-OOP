import java.util.Scanner;

public class Weekly2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Question 1
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        String voteEligibility = (age >= 18) ? "You are eligible to vote." : "You are not eligible to vote.";
        System.out.println(voteEligibility);
        
        // Question 2
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
        
        // Question 3
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        double areaOfTriangle = 0.5 * base * height;
        System.out.println("Area of the triangle: " + areaOfTriangle);

        System.out.print("Enter side length of the cube: ");
        double side = scanner.nextDouble();
        double volumeOfCube = Math.pow(side, 3);
        System.out.println("Volume of the cube: " + volumeOfCube);

        System.out.print("Enter length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the cuboid: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height of the cuboid: ");
        double heightCuboid = scanner.nextDouble();
        double volumeOfCuboid = length * width * heightCuboid;
        System.out.println("Volume of the cuboid: " + volumeOfCuboid);
        
        // Question 4
        System.out.println(voteEligibility); // Reusing the ternary operator from question 1
        
        // Question 5
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        
        // Question 6
        System.out.print("Enter first number: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num4 = scanner.nextInt();
        int sum2 = num3 + num4;
        int product2 = num3 * num4;
        double division = (double) sum2 / product2;
        System.out.println("Division of sum and product: " + division);
        
        // Question 7
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.nextLine();
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest is " + fieldOfInterest + ".");
        
        // Question 8
        System.out.print("Enter side of the square: ");
        double sideSquare = scanner.nextDouble();
        double areaOfSquare = sideSquare * sideSquare;
        double perimeterOfSquare = 4 * sideSquare;
        System.out.println("Area of the square: " + areaOfSquare);
        System.out.println("Perimeter of the square: " + perimeterOfSquare);
        
        // Question 9
        System.out.print("Enter length of the rectangle: ");
        double lengthRectangle = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadthRectangle = scanner.nextDouble();
        int areaRectangle = (int) (lengthRectangle * breadthRectangle);
        System.out.println("Area of the rectangle (type casted to int): " + areaRectangle);
        
        // Question 10
        System.out.print("Enter marks in subject 1: ");
        int subj1 = scanner.nextInt();
        System.out.print("Enter marks in subject 2: ");
        int subj2 = scanner.nextInt();
        System.out.print("Enter marks in subject 3: ");
        int subj3 = scanner.nextInt();
        System.out.print("Enter marks in subject 4: ");
        int subj4 = scanner.nextInt();
        int totalMarks = subj1 + subj2 + subj3 + subj4;
        double percentage = (totalMarks / 400.0) * 100;
        String result = (percentage >= 70) ? "First Class"
                      : (percentage > 59) ? "Upper Second Class"
                      : (percentage > 49) ? "Second Class"
                      : (percentage > 39) ? "Third Class"
                      : "Fail";
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}

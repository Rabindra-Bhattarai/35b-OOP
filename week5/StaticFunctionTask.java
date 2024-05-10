package week5;

public class StaticFunctionTask {
    /*
    * Task1
    * Create a function
    * Takes 2 parameters: string name, int age
    * Returns string
    * If age is less than 0 or more than 200, returns "Hello name, Invalid Age"
    * If age is less than 180, returns "Sorry, name, You are not eligible"
    * Else, returns "Congratulations name, you are eligible"
    */
    public static String checkEligible(String name, int age){
        if(age < 0 || age > 200){
            return "Hello " + name + ", Invalid Age";
        }
        if(age < 180){
            return "Sorry, " + name + ", You are not eligible";
        }
        return "Congratulations " + name + ", you are eligible";
    }

    /* Task 2
     * Create a function makeSquare that takes a double 
     * Returns the square value of the input double
     */
    public static double makeSquare(double num){
        return num * num;
    }

    public static void main(String[] args) {
        // Task 1
        String iGet = checkEligible("John", 20);
        System.out.println(iGet);

        // Task 2
        double squareResult = makeSquare(5.5);
        System.out.println("Square of 5.5: " + squareResult);
    }
}

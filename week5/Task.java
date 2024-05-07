package week5;

public class Task {
    /*Task
     * Make a multiplication
     * for e.g
     * 2x1=2
     * 2x2=4
     * ..
     * 2x10=20
     */
    public class Multiplication {
        public static void main(String[] args) {
            int multiplier = 2; // replace this with the multiplier you want to use
            for (int i = 1; i <= 10; i++) {
                int product = multiplier * i;
                System.out.println(multiplier + "x" + i + "=" + product);
            }
        }
    }
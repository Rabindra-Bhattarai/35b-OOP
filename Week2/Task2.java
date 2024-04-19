
 /*TAsk2  
  * Write a program to print simple interest from variables
  make 3 variable for amount, time and rate and save the calculation into si
  fromula : si = amount * time * rate/100; // use float
 */public class Task2 {

        public static void main(String[] args) {
            float amount = 1000; // replace this with the amount
            float time = 2; // replace this with the time in years
            float rate = 5; // replace this with the rate of interest
    
            // calculate the simple interest
            float si = amount * time * rate / 100;
    
            // print the simple interest
            System.out.println("The simple interest is: " + si);
        }
    
}

package week5;

public class jumpstatement {
    public static void main(String[] args) {
        /*break and continue are jump statement */
        for (int index =0; index <3; index ++){
            if (index ==1){
                break; // this will end the loop from here
            }
            System.out.println("Index " + index);
        }// break will exit scope here
        /* can be used in which /do while */
        int counter = 0;
        while (counter <3){
            if (counter ==1){
                break; // exit from here
            }
            System.out.println("While Counter " + counter);
            counter++;
        }
        /* continue  will skip the current iteration 
         * or will bypass all the statement below it
        */
        for (int index =0; index <5; index ++){
            if (index ==1){
                continue; // this will skip the current iteration
            }
            System.out.println(" continue Index " + index);
        }
        System.out.println("Labeled break");
    /*Labelled Break */
        outerLoop: for (int outer =0; outer <2; outer ++){
            innerLoop: for  (int inner =0; inner <=5; inner ++){
                if (inner ==2){
                    break outerLoop; //this will break the loop with this label
                }
                System.out.println("Inner index" + inner);

            }
            System.out.print("Outer index" + outer);
        }
        /* Task
         * loop from -5 to 5
         * break loop if the value is positive
         */
        for (int index = -5; index <=5; index ++){
            if (index ==0){
                break;
            }
            System.out.println("Negative " + index);
        }

        /*Task 2
         * loop form 1-20
         * print number only if even
         * use continue to complete
         */
        for (int index = 1; index <=20; index ++){
            if (index %2!=0){
                continue;
            }
            System.out.println("Even " + index);
        }

        


    }
    
}

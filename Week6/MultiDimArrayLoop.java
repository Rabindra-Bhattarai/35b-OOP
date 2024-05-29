package Week6;

public class MultiDimArrayLoop {
    public static void main(String[] args) {
        int [][] twoArray = new int[2][3];
        twoArray [0][0] = 10;
        twoArray [0][1] = 20;
        twoArray [0][2] = 30;
        twoArray [1][0] = -30;
        twoArray [1][1] = -20;
        twoArray [1][2] = -10;

        /* visual
         * [
         * [10,20,30], -> 0
         * [-30,-20, -10] ->1
         * ]
         */
        /*Loop multiple dim array with nested loop */
        /*Outer selectes the array, inner selects the actual value inside */
        int outerLength = twoArray.length;
        for (int outer=0; outer < outerLength; outer ++){
            //twoArray[outer]-> iterate each array
            int innerLength = twoArray[outer].length;
            for (int inner=0; inner < innerLength; inner ++){
                System.out.println(twoArray[outer][inner]);
        }
        

    }
    /*task
     * make the following 
     * [
     * ["Sarjak","Aayush", "rabi"]
     * ["Yudip", "Utsav", "Bibek"]
     * ["Rabina", "Kimiti", "Snhea"]
     * 
     * ]
     * print all the names
     * also, find on which array is kimti is
     * output:
     * 2
     */

     {
            String[][] namesArray = {
                {"Sarjak", "Aayush", "Rabi"},
                {"Yudip", "Utsav", "Bibek"},
                {"Rabina", "Kimiti", "Snhea"}
            };
    
            // Print all the names
            for (String[] sublist : namesArray) {
                for (String name : sublist) {
                    System.out.println(name);
                }
            }
    
            // Find the index of "Kimiti"
            for (int i = 0; i < namesArray.length; i++) {
                for (int j = 0; j < namesArray[i].length; j++) {
                    if ("Kimiti".equals(namesArray[i][j])) {
                        System.out.println("Index of \"Kimiti\": " + i);
                        break;
                    }
                }
            }
        }
    }
    

    
    }


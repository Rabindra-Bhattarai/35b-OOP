package Week6;

public class ArrayClass {
    public static void main(String[] args) {
        /*Array declaration */
        int[] myFirstArray;
        /*memory allocate */
        myFirstArray = new int[5];
        /*Array Declaration and memory alloc */
        int[] mySecondArray = new int[3];
        /*Array Declaration and memory alloc and initialization */
        int[] myThirdArray = {10, 10, 30, 40};

        //Array index--> positon of element/values
        //start with zero

        mySecondArray[0]=10;
        mySecondArray[1]=20;
        mySecondArray[2]=100;
        //Access/store in new variable
        int arrayElement = mySecondArray[0];
        System.out.println("First index" +arrayElement);
        System.out.println("Second index" + mySecondArray[1]);
        
        /* make the following array named animals 
        *["cat", "dog", "tiger", "snake"]
        * and print "Snake"
        */

        String[] a = {"cat", "dog", "tiger", "snake"};
        System.out.println(a[3]);


 
    }
    
}

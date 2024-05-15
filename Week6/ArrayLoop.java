package Week6;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = -10;
        arr[1] = 0;
        arr[2] = 10;
        arr[3]=20;
        
        /*we need length of array first,use.length */
        int arrayLength = arr.length;
        /*Loop from 0-(arrayLength -1), 0 -3 */
        for(int index = 0; index < arrayLength; index ++) {
            System.out.println(arr[index]);
        
        }
        //or, use condition, index <=arraylength-1
        System.out.println("Descending loop");
        for(int index =arrayLength-1; index >=0; index--){
            System.out.println(arr[index]);
        }

        /* Loop the arr using while loop */
        /*make an array of[" john", "Doe", "Foo", "Bar"]
         * make a string "Foo"
         * loop the array and find in which index is "Foo" on
         * print the index
         */
        String[] names = {"john", "Doe", "Foo", "Bar"};
        String target = "Foo";

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(target)) {
                System.out.println("Index of \"" + target + "\": " + i);
                break;
            }
        }

        /* make the function for the above name arrayFinder
         * Takes array of String amd String as parameter
         * return index if 2nd argument value matches any elements of array
         * else return -1
         * print the return index value
         */
        
         int index = arrayFinder(names, target);
        System.out.println("Index of \"" + target + "\": " + index);
    }

    public static int arrayFinder(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;




    }
}

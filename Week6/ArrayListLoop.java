package Week6;
import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        /*import array list on top, import java.util.ArrayList */

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(10);
        intArr.add(20);
        intArr.add(30);
        intArr.add(50);

        /*to loop arraylist, same as array, get length/size first */
        /*to get lenth use .size()*/
        int arrLen = intArr.size();

        /*Loop from 0 to size /len -1 */
        for(int index=0; index< arrLen; index++){
            System.out.println(index +intArr.get(index));
        }

        //using for each
        for(Integer element: intArr){
            System.out.println(element);
        }
        
        
      
    }
    
}

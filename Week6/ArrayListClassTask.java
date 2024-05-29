package Week6;
import java.util.ArrayList;
public class ArrayListClassTask {
    public static void main(String[] args) {
        /*task
         * Make ArrayList Of the following
         * ["Apple", "Orange", "Banana", "Water mealon", "Pineapple"]
         * Add "Grapes" in 1 Index
         * remove orange from the arrayList
         * remove watermealon
         * add pear in 0th index
         * change"pineapple" to Avacado
         * change apple to cheery
         * notr: print on every add and remove to get the new index of asrray
         * 
         */
        ArrayList<String> fruits = new ArrayList <>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Water mealon");
        fruits.add("Pine apple");

        fruits.add(1, "Grapes");
        System.out.println(fruits);

        fruits.remove("Orange");
        System.out.println(fruits);

        fruits.remove("Water mealon");
        System.out.println(fruits);

        fruits.add(0, "pear");
        System.out.println(fruits);

        fruits.set(4, "Avacado");
        System.out.println(fruits);

        fruits.set(1, "cheery");
        System.out.println(fruits);
        

        

        



    }
    
}

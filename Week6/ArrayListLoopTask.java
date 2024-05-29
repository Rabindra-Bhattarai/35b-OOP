package Week6;
import java.util.ArrayList;
public class ArrayListLoopTask {
    public static void main(String[] args) {
        /*make an ArrayList as students as following 
         * ["Aruna", "Shreeya", "Yudip","Anjali", "Nischaya", "Krishna"]
         * make 2 another ArrayList males and females
         * Loop the stuents ArrayList
         * add "Yudip", "Nischaya"and "Krishna" in males
         * add "Aruna", "Shreya" and "Anjali" in females
         * print Anjali from females
         * print yudip from males
        */

        ArrayList<String> students = new ArrayList<>();
        students.add("Aruna");
        students.add("Shreeya");
        students.add("Yudip");
        students.add("Anjali");
        students.add("Nischaya");
        students.add("Krishna");

        ArrayList<String> males = new ArrayList<>();
        ArrayList<String> females = new ArrayList<>();

        
        for (int index=0; index < students.size(); index++){
            String value=students.get(index);
            if(value =="Aruna"|| value =="shreeya" || value=="Anjali"){
                females.add(value);
            }else{
                males.add(value);
            }
            //using foreach
        for (String value1: students){
            if (value1=="Aruna"|| value1 =="shreeya" || value1=="Anjali"){
                females.add(value1);
        }else{
            males.add(value1);
        }
    }




    }
}
}
    


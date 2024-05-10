package week5;

public class FunctionClass {
    /*finctions are made inside the class scope
     * above or below main not inside
     */
    void printSomething(){
        System.out.println("This functions prints");

    }
    /*with return type */
    int returnInt(){
        int value =10;
        return value;
    }
    double addValue(int num1, double num2){
        double sum =num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        /* To call a normal/non static function, we need to create object
         * just remember the syntax for now
         */
        FunctionClass fc = new FunctionClass();
        /* To call function from object/variable of FunctionClass */
        fc.printSomething();
        /*call multiple times */
        fc.printSomething();
        /*can call multiple times */
        fc.printSomething();
        int returnFromFunction =fc.returnInt();
        System.out.println("Returned value from function is "+returnFromFunction);
        double returnFromAdd =fc.addValue(10, 20.2);
        System.out.println("Add return "+ returnFromAdd);
       
    }
    
}

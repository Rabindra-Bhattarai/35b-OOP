package .vscode;

public class VariableClass {
    /*Instance variable
     *Access with object
     * is not shared with other object
    */
    int instanceVariable = 120;
    /*static variable
     * access with class
     * is shared with other object
     */
    static int staticVariable = 2000;
    
    public static void main(String[] args) {
        /*permitive data type */
        /*Declaration */
        byte byteValue;
        /*Initilization */
        byteValue = 10;
        /*Declaration and Initilization */
        short Value =100;
        /*Multiple Declaration */
        int intValue1, intValue2;
        /*Multiple initilization */
        intValue1 = -99; intValue2 =99;
        /*Multiple Declaration and Initilization */
        long longValue1 = -999, longValue2 =999;
        float floatValue = 1.90f; // the letter 'f' is required
        double doubleValue = 28.88d; // the letter 'd' is optional
        char charValue = 'A'; //single letter in singlr quotes
        boolean booleanValue = true; //true/ false lowercase
        


        /* Non permitive Data type */
        /*string */
        String stringInfo1 = "This is a variable";
        /*using class */
        String stringInfo2 = new String("Class");
        /*Object use the same class as written above */
        VariableClass variableObj = new VariableClass(); 
        
        /*Illegal actions following */
        /*byte byteValue = 10; //you cannot redeclare */
        /*byteValue =20; //instead reassign */
        /*boolean boolval3 ='false'//wrong data type */
        /*short shortVal = 100000000;// cannot exceed min/max */
        
        /*we need to use object to access instance variable */
        System.out.println(variableObj.instanceVariable);
        /*we can access the static variable with class */
        System.out.println(VariableClass.staticVariable);
        
        /*Type casting
         * implicit type casting (automatic)
         * from smaller type to larger type*/

        int intValueConvert = 10;
        double intValueConvertedToDouble = intValueConvert;
        /*Explict type casting (manual)
         * from larger type to smaller type*/
         double doubleValueConverted = 19.23d;
         int intValueConvertedToInt = (int) doubleValue;
        
        
        
    
    
    }
    
}


    

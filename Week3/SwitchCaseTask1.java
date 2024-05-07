package Week3;

public class SwitchCaseTask1 {
    public static void main(String[] args) {
    /*Task
     * use switch case for the following
     * 0-Sunday
     * 1-Monday
     * 3-Tuesday
     * 4-Wednesday
     * 5-Thursday
     * 6-Friday
     * 7-Saturday
     * rest-Invalid
     */
    char charValue ='a';
    switch (charValue){
        case 0:
            System.out.println("Sunday");
            break;
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Sunday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Friday");
            break;
        case 7:
            System.out.println("Saturday");
            break;
        case 9:
            System.out.println("Invalid");

    }
}
    
    
}


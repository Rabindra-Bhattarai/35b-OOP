package Week3;

public class SwitchCase {
    public static void main(String[] args) {
        char charValue ='b';
        int intValue = 10;
        switch (charValue){
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                switch(intValue){
                    case 10:
                    System.out.println("Ten");
                    break;
                    case 20:
                    System.out.println("Twenty");
                    break;
                    default:
                    System.out.println("Invalid");
                    break;
                }

                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("cat");
                break;
            default:
                System.out.println("Inavlid");
                break;

        }
    }
    
}

package Week3;

public class IfElseClass {
    public static void main(String[] args) {
        
        /*If statement */
        if(true){
            System.out.println("True Statement");

        }
        /*If takes boolean expression inside() */
        int num1=10, num2=20;
        if(num1==num2){
            System.out.println("Equal");
            }
        else{
            System.out.println("Not Equal");

        }
        /*note that else is optional */
        /*if else if ladder*/
        if(num1>num2){
            System.out.println("Greater");
        }else if (num1 !=num2){
            System.out.println("Not Equal");
        }else if (num1==num2){
            System.out.println("Equal");
        }else{
            System.out.println("Defult Statement");
        }

        /*Nested if statement */
        if(num1<0){
            if (num1>num2){
                System.out.println("Negativen and Greater");
            }else{
                System.out.println("Negative and lesser");

            }
        }else{
            if(num1>num2){
                System.out.println("Positive and Greater");
            }else{
                System.out.println("Positive and lesser");
            }
        }
        
    }

}

    


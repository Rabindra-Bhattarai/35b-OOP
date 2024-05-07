public class JavaArguement {
    public static void main(String[] args) {
        if (args.length<2){
            System.out.println(" Not enough Argument");
            return;
        }
        System.out.println("The first argument is" +args[0]);
        System.out.println(" The second args is " + args[1]);

        int normalValue = 10;
        int parseInt = Integer.parseInt(args[1]);
        /*Note that the second argument must be number */
        int sum = normalValue + parseInt;
        System.out.print(sum);
    }
    
}

public class Task3 {
    /*TAsk3
     * write a program to print the area and parameter of rectangle 
     * area= length * breadth
     * perimeter= 2(length + breadth)
     * 
     */
   
        public static void main(String[] args) {
            int length = 5; // replace this with the length of the rectangle
            int breadth = 10; // replace this with the breadth of the rectangle
    
            // calculate the area
            int area = length * breadth;
    
            // print the area
            System.out.println("The area of the rectangle is: " + area);
    
            // calculate the perimeter
            int perimeter = 2 * (length + breadth);
    
            // print the perimeter
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
    
}

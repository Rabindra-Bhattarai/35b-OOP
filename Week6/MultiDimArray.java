package Week6;

public class MultiDimArray {
    public static void main(String[] args) {
        /* One D array, one square bracket */
        int[]oneDArray;
        /*Two D array, Two square bracket[][]*/
        int[][] twoDArray;
        /*Three D array, Three square bracket[][][]*/
        int[][][] threeDArray;
          /*must give size to each dimensional */
          twoDArray  = new int[2][3];
          /*visual
          [
            [0,0,0], ->0
            [0,0,0] ->1

          ] 
          */
          //twoDArray[0]->access the )th index array
          twoDArray [0] [0]= 10;
          twoDArray [0] [1]= 20;
          twoDArray [1] [0]= 100;
          twoDArray [1] [2]= 200;
          //access in variable
          int arrayElement = twoDArray[0][0];
          System.out.println(arrayElement);
          System.out.println(twoDArray[0][1]);
          System.out.println(twoDArray[1][0]);
          System.out.println(twoDArray[1][2]);

          /*make the following array
           * [
           * [10, -10],
           * [20, -20],
           * [-30, 8],
           * [40, 45],
           * [50,56]
           * ]
           * 
           * print the value 
           * 50, 56
           * 
           */

           int [][] arrTwo = {
            {10, -10},
            {20, -20},
            {-30, 8},
            {40, 45},
            {50,56}
            };
            System.out.println(arrTwo[4][0]);
            System.out.println(arrTwo[4][1]);
           
        


    }
    
}

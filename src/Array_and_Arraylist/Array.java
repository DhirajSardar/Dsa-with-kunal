package Array_and_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         /*this  is not mandatory to give size of columns because the jvm treats 2d array as arrays of array
         int [][] multidimensionalArray = new int[3][];
                  {
                    {1,2,3},
                    {5,6},
                    {7 }
                    {8,9}
                  }
          */
        int [][] multidimensionalArray = new int[3][];
        // let us take the example of taking input
        int [][] multidimensionalArray1 =
        {
            {1,2,3},
            {5,6},
            {7 },
            {8,9}
        };

//        // let's take the input
        for (int row =0;row<3;row++) {
            for (int col = 0; col <= multidimensionalArray[row].length; col++) {
                multidimensionalArray[row][col] = in.nextInt();
            }
        }

//            for (int row =0;row<multidimensionalArray1.length;row++)
//            {
//                for (int col=0;col<multidimensionalArray1[row].length;col++){
//                    System.out.print(multidimensionalArray1[row][col] +" ");
//                }
//                System.out.println();
//        }

        // 1.using the Arrays.toString()
        System.out.println("using the first");
        for (int row =0;row<multidimensionalArray1.length;row++)
        {
            System.out.println(Arrays.toString(multidimensionalArray1[row]));
        }
        System.out.println("using second");
       //2. printing using the enhanced for loop
        // Syntax : for(data_type elment :to which you want to   iterate)
        for (int []a:multidimensionalArray1
             ) {
            System.out.println(Arrays.toString(a));
        }
    }
}

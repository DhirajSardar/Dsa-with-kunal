package BinarySearchIn2DArray;

/*
this is an example of search in 2d array in java

 */

import java.util.Arrays;

public class RowAndCol_2DArray {
    public static void main(String[] args) {
      int [][] matrix = {
              {10,20,30,40},
              {15,25,35,45},
              {17,27,37,47},
              {22,32,42,52},
      };

//        System.out.println(
//                matrix[0].length+" "+
//
//                        matrix.length
//        );
//
//        System.out.println(matrix.length);
      int [] ans = SearchSortedRowAndCol(matrix,347);

        System.out.println(Arrays.toString(ans));

    }
    static  int [] SearchSortedRowAndCol(int [][]matrix,int target)
    {
        int row=0;
        int col=matrix.length-1;
        while (row<matrix.length && col>=0){
             if (matrix[row][col]== target)
             {
                 return new int[]{row,col};
             }

             else if (matrix[row][col]<target)
             {
                 row++;
             }

             else {
                 col--;
             }
        }
        return new int[]{-1,-1};
    }
}

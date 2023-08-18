package Sorting.SelectionSort;

import java.util.Arrays;

/*
This is Cyclid sort.
 */
public class CyclicSort {
    public static void main(String[] args) {
        int [] arr= {5,2,3,4,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicsort(int []arr)
    {
        // procedure f
        // 1.Check 2, swap 3. move
         int i =0;
         while (i< arr.length)
         {
             // check
             int correct = arr[i]-1;
             if (arr[i]!=arr[correct])
             {  // swap
                 swap( arr,i , correct);
             }
             // move
             else {
                 i++;
             }
         }
    }
    static  void swap( int []arr, int first, int second)
    {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}

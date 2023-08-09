package Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {1,2,10,4,5};



// check for the max index .
//        System.out.println( arr[findmax(arr)]);
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // this is the function of the bubble sort
    static  void selectionsort(int []arr)
    {
        // steps
        // 1. find the max element in  array first and swap with element at the last index .here element will be sorted from the last
        // 2 . Or we can fine the minimum element in the array and swap it with the first index .here element will be sorted from the start
         int max = findmax(arr);
         int last = arr.length-1;
         for (int i =0;i<arr.length;i++)
         {
           swap(arr,max,last);
         }


    }

    // swap function

    static void swap (int []arr,  int start,int end  )
    {
        int temp= arr[start];
        arr[start]=arr[end];
        arr[end]= temp;
    }

   static int  findmax( int []arr){
        int max = 0;
        for (int i =0;i<arr.length;i++)
        {
            if (arr[max]<arr[i]){
                max= i;
            }
        }
        return max;
   }


}

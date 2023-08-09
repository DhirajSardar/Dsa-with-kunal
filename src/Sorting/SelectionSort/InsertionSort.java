package Sorting.SelectionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {1,2,10,4,5};insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void insertion_sort(int arr[])
    {
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = 1; j <=arr.length-1 ; j++) {
              if ( arr[j+1]<arr[j])
              {
                      swap(arr,j,j+1);
              }
            }
        }

    }
    static  void swap   (int []asr, int start ,int end )
    {
        int temp = start;
        start = end ;
        end=temp;

    }
}

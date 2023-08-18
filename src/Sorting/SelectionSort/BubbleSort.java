package Sorting.SelectionSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // this is the function of the bubble sort
    static  void bubbleSort(int []arr)
    {   // i:- just a counter that will run for the N times
        // j :- will run for the N-1 times , Where N is the length of the array
        boolean swapped =false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-1 ; j++) {
                // check whether item that is next to j pointer is smaller than the jth element or not if it is SWAP
                if (arr[j+1]<arr[j])
                {
                    // swap them
                    int temp =  arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]= temp ;
                    swapped=true;
                }

            }
            if (!swapped)
                break;

        }


    }
}

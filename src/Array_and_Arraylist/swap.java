package Array_and_Arraylist;

import Array_and_Arraylist.Array;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int []arr= {1, 3 ,7 ,9 ,20};
        char s[]= {'a','b','c','d','e'};
//        System.out.println("Before Array_and_Arraylist.swap:"+" "+Arrays.toString(arr));
//        Array_and_Arraylist.swap(arr,0,4);
//        System.out.println("After Array_and_Arraylist.swap"+" "+Arrays.toString(arr));
//        System.out.println("reverse the array ");
//        reverse(arr);
        reverse(s);
        System.out.println(s);
        System.out.println(Arrays.toString(arr));

    }
    static  void  swap (int []arr, int ind1,int ind2)
    {
        int temp  = arr[ind1];
        arr[ind1]= arr[ind2];
        arr[ind2]= temp;

    }
    static  void  swap1 (char []arr, int ind1,int ind2)
    {
        char temp  = arr[ind1];
        arr[ind1]= arr[ind2];
        arr[ind2]= temp;

    }
    static  void  reverse(char []arr)
            // in the  reversing the array element we just need to increment the start and decrement the end
    {
         int start =0 , end = arr.length-1;
         while (start<end)
         {
              swap1(arr, start , end);
               start++;
               end--;
         }
    }
}

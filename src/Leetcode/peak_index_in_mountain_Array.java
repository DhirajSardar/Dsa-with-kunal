package Leetcode;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peak_index_in_mountain_Array
{
    public static void main(String[] args) {
        int []arr= {0,1,0,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int[] arr )
    {
        int start =0;
        int end =arr.length-1;
//        int mid=(start+end)/2; this is the naive approach

        while (start<end) {
            // this mid should be inside the loop because in each iteration the value of mid is going to change
            int mid = start + (end - start) / 2;
            if (arr[mid]>arr[mid+1])
            {
                // you are in decreasing part of array
                // there may be the ans , look at left
                // this is why end != mid -1
                end =  mid;

            }
            else {
                // you are in the ascending part ..
                start= mid+1;// this is because mid+1 element is > mid element.
            }
        }
        // at end start == end
        return start ;
    }
}


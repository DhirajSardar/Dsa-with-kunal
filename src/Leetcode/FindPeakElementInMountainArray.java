package Leetcode;
// https://leetcode.com/problems/find-peak-element/
public class FindPeakElementInMountainArray {

    public static void main(String[] args) {
       int []arr= {1,2,3,1};

       int ans = findPeakElement(arr);
        System.out.println(ans);
    }
     static  int findPeakElement(int[] nums) {

        int start =0;
         int  end = nums.length-1;
         while (start<end) {
             int mid = start+(end -start)/2;
             if(nums[mid]>nums[mid+1])
             {
                 end =mid;
             }

             else {

                 start= mid +1;
             }
         }
         return  end ;
    }
}

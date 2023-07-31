package Leetcode;

import java.util.Arrays;

public class First_and_last_position_of_the_element_in_sorted_Array {
    public static void main(String[] args) {
       int  []nums = {5,7,7,8,8,10};
       int target = 8;
       int []ans = SearchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int  [] SearchRange(int []nums, int target)

    {
        // check for the first occurrence of the target
         int  []ans={-1,-1};
          // check for the first occurrence of the target;
        ans[0] = searchIndex(nums,target ,true);
        ans[1]= searchIndex(nums,target,false);
        return  ans;

    }


    // this function return the target
   static int searchIndex(int[]nums,int target, boolean FindStartIndex)
    {
        int  ans =-1;
        int start=0;int end = nums.length-1;
        while (start<=end)
        {
            int mid =start+(end-start)/2;
            if (target<nums[mid])
            {
                end=mid-1;
            }
            else if(target>nums[mid]){
                start= mid+1;
            }
            // potential answer is found
            else {
                ans = mid ;
                if (FindStartIndex)
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}

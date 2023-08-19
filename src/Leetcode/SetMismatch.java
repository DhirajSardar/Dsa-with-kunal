package Leetcode;
//https://leetcode.com/problems/set-mismatch/description/
import java.util.Arrays;

public class SetMismatch

 {
    public static void main(String[] args) {
          int []arr= {1,1};
        System.out.println(Arrays.toString(findErrorNums(arr)));

    }
    static int[] findErrorNums(int[] nums)
    {
        int i =0;
        while (i <nums.length)
        {

            if (nums[i]!=nums[nums[i]-1])
            {
                swap(nums,i,nums[i]-1);

            }

            else {
                i++;
            }

        }
        for (int index=0;index<nums.length;index++)
        {
            if (nums[index]!=index+1)
            {
               return new int[]{nums[index],index+1};
            }
        }

       return nums;
    }
    static void swap(int []ar, int start ,int end )
    {
        int temp = ar[start];
        ar[start]= ar[end];
        ar[end]=temp;
    }


}

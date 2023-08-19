package Leetcode;


//https://leetcode.com/problems/first-missing-positive/
public class FindMissinPostive {
    public static void main(String[] args) {
           int a[]= {3,4,-1,1};
        System.out.println(firstMissingPositive(a));
    }
    static int firstMissingPositive(int[] nums) {
        int i =0;
        while (i <nums.length)
        {
            int correct = nums[i]-1;
            if ( nums[i]>0 && nums[i]<=nums.length&&nums[i]!=nums[correct]){
                swap ( nums,i,correct);
            }
            else {
                i++;
            }
        }



        // find the smallest missing positive number
        for (int index = 0;index<nums.length;index++)
        {
            if (   nums[index]!=index+1)
            {
              return index+1;
            }
        }

   return nums.length+1;
    }
    static void swap(int arr[],int s,int e)
    {
        int temp = arr[e];
        arr[e]= arr[s];
        arr[s]= temp;
    }

}

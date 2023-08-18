package Leetcode;
//https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicateNumber {
    public static void main(String[] args) {
         int []arr= {2,3,4,5,1,7,7};
        int ans= findDuplicate(arr);

         // after sorting 1,2,3,4,5,7,7
        System.out.println(ans);
    }
    static int findDuplicate(int[] nums) {
        int i =0;

        while (i < nums.length)
        {
            if (nums[i]!=i+1){
                int correct = nums[i]-1;
                if (nums[i]!=nums[correct])
                {
                    swap (nums,i,correct);
                }
                else {
                   return nums[i];
                }
            }

            else {
                i++;
            }
        }
       return -1;
    }
    static void swap (int []arr,int start,int end )
    {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]= temp;
    }
}

package Leetcode;
//https://leetcode.com/problems/missing-number/
import java.util.ArrayList;
import java.util.List;

class FindAllTheMissingNum {
    public static void main(String[] args) {
        int arr[]= {2,2};

       List<Integer> list=  findDisappearedNumbers(arr);
        for (int i =0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
         while (i <nums.length)
         {
             int correct = nums[i]-1;
             if (nums[i]!=nums[correct])
             {
                 swap(nums,i,correct);
             }
             else {
                 i++;
             }
         }

         // Search for the missing element and store in the list.
        List<Integer> list= new ArrayList<Integer>();
         for (int index =0;index<nums.length;index++)
         {
             if (nums[index]!=index+1)
                 {
                      list.add(index+1);
                 }
         }

     return list;
    }
    static void swap(int []nums,int start ,int end ){
        int temp= nums[start];
        nums[start]= nums[end];
        nums[end]=temp;
    }

}
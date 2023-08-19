package Leetcode;

import java.util.ArrayList;
import java.util.List;

import static Leetcode.MissingNum.swap;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllTheDuplicateInArray {
    public static void main(String[] args) {
    int nums[]={4,3,2,7,8,2,3,1};
     ArrayList <Integer> list= (ArrayList<Integer>) findDuplicates(nums);
        System.out.println(list);

    }

     static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list= new ArrayList<Integer>();
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
                list.add(nums[index]);
            }
        }

        return list;
    }
}

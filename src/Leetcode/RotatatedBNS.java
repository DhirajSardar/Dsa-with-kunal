package Leetcode;


public class RotatatedBNS {
    public static void main(String[] args) {
        // nums = [4,5,6,7,0,1,2], target = 0

        int [] nums ={4,5,6,7,0,1,2};

        int target = 6;
//        int pivot = findPivot(nums);
//        System.out.println(pivot);
        int ans =search(nums,target);

        System.out.println(ans );


    }

    // function to search the index of the target
    static int search(int[] nums, int target)
    {
          int pivot = findPivot(nums);
          //If the pivot element is not found then apply simple binary search
          if(pivot==-1)
          {
              // dd simple binary search
              return binarySearch(nums,target,0,nums.length-1);

          }
          //If the pivot element is found ,In that scenario we have 3 case:
        // case:- 1  your  pivot == target
        if (nums[pivot]== target) {

            return pivot;
        }
        // if the target lies in the search space from START to Pivot-1 >This means lies in the left half.
         if (target>=nums[0]){
             return binarySearch(nums,target,0,pivot-1);
         }
         else {
             return binarySearch(nums,target, pivot+1,nums.length-1);
         }
    }

    // Simple Binary Search
    static int binarySearch( int []arr,int target ,int start , int end )
    {
        while (start<=end )
        { int  mid = (start+end)/2;
            if (target<arr[mid])
            {end = mid -1;}
            else if(target>arr[mid])
                start=mid+1;

               else {
                   return   mid ;
             }

        }       return -1;
    }
    // function to find the pivot element in the rotated sorted array
    // this will not work for the duplicate values.
    static int findPivot(int []arr)
    {
        int start =0;
        int end = arr.length-1;
        while (start<=end )
        {
            int mid = start+(end-start)/2;
            // case 1 : pivot lies ahead of the middle element
            if ( mid < end && arr[mid]>arr[mid+1])
            {
                return  mid;
            }

            // case 2 : pivot lies before the middle element
            if(  mid> start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            // case 3 : What if the start element is greater than the mid-element .Does that going to make sense that we need to find the pivot on the right of middle
            // as we know that the pivot is THE GREATEST Element in the array
            if (arr[start]>=arr[mid])
            {
                end = mid -1;
            }
            // case 4: What if the start element is lesser than the middle element ? Does it going to make sense that we need to search in left part
            // as we know that the pivot is the greatest element in the array
            else
            {
                start = mid+1;
            }
        }
        return -1;

    }

}

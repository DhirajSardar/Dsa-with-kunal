package Leetcode;

public class Find_the_count_of_times_array_is_rotated {
    public static void main(String[] args) {
        int [] nums ={1 ,2 ,3 ,4, 5, 6,7 };

        int ans =count(nums);
        System.out.println("Array Rotated : "+ans+" times." );

    }
    // function of the count
    static int count(int []arr)
    {
        return findPivot(arr)+1;
    }
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

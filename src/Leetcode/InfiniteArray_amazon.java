package Leetcode;
 /*
 Amazon question
 just slight addition of the code
 static int  findrange(int []arr, int target)
    {
        // first find the range
        // start with the box of 2
        int start =0;
        int end =1;
        // condition for the element to lie in the range
        while (target>arr[end])
        {
             int newStart = end+1;
             // double the box value
             // formula for end = previous end + (size of box)*2;
            end= end+(end-start+1)*2;
            start= newStart;

        }
        return  BinarySearch(arr,target,start,end);
    }
  */

public class InfiniteArray_amazon {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target=11;
        System.out.println(findrange(arr,target));
    }


    // finding the range or search space
    static int  findrange(int []arr, int target)
    {
        // first find the range
        // start with the box of 2
        int start =0;
        int end =1;
        // condition for the element to lie in the range
        while (target>arr[end])
        {
             int newStart = end+1;
             // double the box value
             // formula for end = previous end + (size of box)*2;
            end= end+(end-start+1)*2;
            start= newStart;

        }
        return  BinarySearch(arr,target,start,end);
    }

    static  int BinarySearch(int []arr,int target, int start,int end )
    {
//        int mid=(start+end)/2; this is the naive approach

        while (start<=end){
            // this mid should be inside the loop because in eaach iteration the value of mid is going to change
            int mid = start+(end-start)/2;
            // check for left side
            if (target<arr[mid])
                end=mid-1;
            else if (target>arr[mid]) {
                start= mid+1;

            }
            else {
                return mid;
            }
        }
        return  -1;
    }


}

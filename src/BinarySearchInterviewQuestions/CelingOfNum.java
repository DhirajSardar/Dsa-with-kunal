package BinarySearchInterviewQuestions;
// Ceiling:- Smallest number which is >= target.
public class CelingOfNum {
    public static void main(String[] args) {
        int []arr = {-18,-12,-2,-1,0,2,3,4,7,8,12,23,56,89};
        int target = 100;
        int ans= Ceiling(arr,target);
        System.out.println("Ceiling Of "+target+" is "+""+ans);
    }
    static  int Ceiling(int []arr,int target)

    {
        int start =0;
        int end =arr.length-1;
//        int mid=(start+end)/2; this is the naive approach

        // what if target is greater than the element at the last index
        if (target>arr[arr.length-1])
        {
            return -1;
        }

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
                return arr[mid];
            }
        }
        return  arr[start];
    }
}

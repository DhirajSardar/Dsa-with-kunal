package BInarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int []arr = {-18,-12,-2,-1,0,2,3,4,7,8,12,23,56,89};
        int []arr1 = {99,89,67,45,23,11,9,6,2,0,-1,-34,};
        int target1= 99;
        int target = -12;
        int ans= orderagnosticBNS(arr,target);
        int ans1=orderagnosticBNS(arr1,target1);
        System.out.println(ans);
        System.out.println(ans1);

    }

    // orderAgnostic BS:- It is the binarySearch in which we don't know whether an array is sorted in
    // ascending or descending order, so we can check if by
                                                          /*
                                                           if   firs<last >> ascending
                                                           else descending .
                                                           */
    static int orderagnosticBNS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc= arr[0]< arr[arr.length-1];


//        int mid=(start+end)/2; this is the naive approach
            while (start <= end) {
                // this mid should be inside the loop because in each iteration the value of mid is going to change
                int mid = start + (end - start) / 2;

                // first check for the middle element which is same for the both.
                if (target==arr[mid]){
                    return mid;
                }
                // check for left side
                if (isAsc){
                    if (target < arr[mid])
                        end = mid - 1;
                    else if (target > arr[mid]) {
                        start = mid + 1;

                    }
                }
                else {
                    if (target >arr[mid])
                        end = mid - 1;
                    else if (target <arr[mid]) {
                        start = mid + 1;

                    }
                }
            }


        return -1;

    }
}

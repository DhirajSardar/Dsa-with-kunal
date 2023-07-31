package LinearSearch;

public class SearchIn2DlArray {
    public static void main(String[] args) {
        int [][]arr = {
                {12,3,5,67,8,9},
                {1,23,4,5,2,8},
                {31},
                {78}
                       };

//        int []index = SearchIn2DlArray_linearSearch(arr,3);
        int ans = SearchIn2DlArray_linearSearchMaximum(arr);
        System.out.println(ans);
    }

    static  int []SearchIn2DlArray_linearSearch(int [][]arr, int target)
    {
        if (arr.length==0)
        {
            return new  int [] {-1,-1};
        }
        for (int row =0;row<arr.length;row++){
            for (int col=0;col<arr[col].length;col++){
                if (arr[row][col] == target){
                    return new int[]{row , col };
                }

            }
        }
        return new  int [] {-1,-1};
    }
    // Maximum in the 2DArray
    static  int SearchIn2DlArray_linearSearchMaximum(int [][]arr)

    {
        int max = Integer.MIN_VALUE;
        if (arr.length==0)
        {
            return  Integer.MAX_VALUE;
        }
//        for (int[] ints : arr)
//            for (int elment :ints ) {
//                max=elment;
//
//            }

        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max)
                    max = element;
            }
        }
        return  max;

    }
}

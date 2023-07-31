package LinearSearch;

public class MaxAndMin {
    public static void main(String[] args) {
        int []arr= {34,56,64,634,46,23,89,899,980};
        int min = minInarray(arr);
        System.out.println(min);

    }
    static  int minInarray(int arr[])
    {
        int min = arr[0];
       for (int i =0;i<arr.length;i++)
       {
           if (arr[i]<min)
           {
               min = arr[i];
               return min;
           }
       }
       return Integer.MAX_VALUE;
    }
}

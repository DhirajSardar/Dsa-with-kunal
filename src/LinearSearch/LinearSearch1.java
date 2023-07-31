package LinearSearch;

public class LinearSearch1
{
    public static void main(String[] args) {
        int []arr= {34,56,64,634,46,23,89,899,980};
         int target=34;
//        int ans = LinearSearch(arr, target);
//        System.out.println(ans);
        int ans = LinearSearchInRange(arr, 2, 6,target);
        System.out.println(ans);


    }
    static  int LinearSearch(int []ar,int target)
    {
        // if element found then return the index
        // if not found return -1
        // check for empty array
        if ( ar.length==0)
            return -1;

         for (int  i =0;i<ar.length;i++)
         {
             if (target==ar[i])
             {
                  return  i;
             }
         }
        return  -1;
    }

    // finding in the range of the array
    static  int LinearSearchInRange(int []arr, int start ,int end , int target)

    {
        // check sum
        if (arr.length == 0) {
            return -1;
        }
        for ( int i=start;i<=end;i++)
        {
             if (arr[i]== target)
                 return  i;
        }
         return  -1;
    }
}

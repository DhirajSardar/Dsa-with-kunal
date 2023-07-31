package Leetcode;

public class EvenDigit {
    public static void main(String[] args) {
      int []arr={1, 3,33,434,5342,23423,23,2335};
        System.out.println(FindNum(arr));
    }
    static  int FindNum(int[] nums)
    {
        int ans =0;
        for (int evn: nums
             ) {
            if (containEvn(evn))
            {
                ans++;
            }
        }
        return  ans;
    }
    // Approach 1
//   static boolean containEvn(int num){
//        String x = String.valueOf(num);
//        int y =x.length();
//        if (y%2==0)
//            return true;
//
//        return  false;
//    }

    // Approach 2
    // function to check or return  " whether the number contains even digits or  not"
    static  boolean containEvn(int num )
    {
         int ans = digits(num);
        return ans % 2 == 0;
    }

    // function to count the number of digits.
//    static  int digits(int num)
//    {    int count=0;
//        while ( num>0)
//        {
//            count++;
//            num/=10;
//        }
//        return  count;
//    }

    // optimize way to count the number of digits
    static int digits(double num)
    {
        if (num<0)
            num *=(-1);
        var count =Math.log10(num)+1;
        return (int) count;


    }
}


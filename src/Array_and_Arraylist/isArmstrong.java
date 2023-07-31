package Array_and_Arraylist;

import java.lang.reflect.Array;

public class isArmstrong {
    public static void main(String[] args) {
        boolean n = isArmstrong(1);
        System.out.println(n);
        // printing the armstrong number
        for (int i =1;i<=1000;i++){
            if (isArmstrong(i)){
                System.out.println(i +" ");
            }
        }

    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum =0;
        while (n>0){
           int  rem =n%10;
            n=n/10;
            sum= sum+rem*rem*rem;
        }
        return sum==original;

    }
}

package Leetcode;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Smallest_Letter_greater_than_Target {
//    Input: letters = ["c","f","j"], target = "a"
//    Output: "c"
//    Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

    public static void main(String[] args) {
      char []letter= {'c','f','j'};
      char target = 'z';
      char ans = nextGreatestLetter(letter,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target) {
         int start=0;
         int end =letters.length-1;
         while (start<=end)
         {
              int mid = start+(end-start)/2;
              if (target<letters[mid])
              {
                  end=mid-1;
              }
              else {
                  start=mid+1;
              }
         }
         return letters[start%letters.length];
    }
}

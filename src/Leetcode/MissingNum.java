package Leetcode;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3,5};
      int ans =missingNum(ar);
        System.out.println(ans);
    }

    static int missingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Search for the missing one
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

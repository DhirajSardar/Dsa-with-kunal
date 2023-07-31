package Array_and_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MulDArrraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        // Initialize the arraylist
        for (int i =0;i<3;i++)
        {
            arrayLists.add(new ArrayList<>());
        }
        for (int i =0;i<3;i++)
        {
            for (int j =0;j<3;j++)
            {
                arrayLists.get(i).add(sc.nextInt());
            }
        }
        System.out.println(arrayLists);
    }
}


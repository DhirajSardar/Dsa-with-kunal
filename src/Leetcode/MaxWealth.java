package Leetcode;

public class MaxWealth {
    public static void main(String[] args) {
            int [][]account ={
                    {1,5},
        {7,3},
        {3,5}
            };

        System.out.println(maximumWealth(account));
    }
    static int maximumWealth(int[][] accounts) {

        int wealth = 0;
        for (int i =0;i<accounts.length;i++)
        {
            int sum=0;
             for ( int j=0;j<accounts[i].length;j++)
             {
                 sum+=accounts[i][j];
             }
            if (sum>wealth){
                wealth=sum;
            }
        }

      return  wealth;
    }

}

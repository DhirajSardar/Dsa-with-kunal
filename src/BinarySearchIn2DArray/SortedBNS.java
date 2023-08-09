package BinarySearchIn2DArray;

import java.util.Arrays;

public class SortedBNS {
    public static void main(String[] args) {
        int [][]arr ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int  target = 5;
        System.out.println(
                Arrays.toString(sortedsearch(arr,target))
        );


    }
 // fumction to do simple binary search
    static int []simpleBNS(int [][]matrix , int row, int cStart, int cEnd , int target)
    {
        while (cStart<=cEnd)
        {
            int mid = cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]== target)
            {
                return  new int[]{row, mid};

            }

            if(matrix[row][mid] <target)
            {  cStart=mid+1;
            }
            if(matrix[row][mid]> target)
            {   cEnd= mid-1;
            }
        }
        return new int []{-1,-1};
    }

    static int [] sortedsearch (int  [][]matrix , int target)

    { int row = matrix.length;
        int col = matrix.length-1;
          if (row==1 )
          {
              return simpleBNS(matrix,0,0, col-1, target);
          }
          // run the loop till two rows are remaining .
         int rStart = 0;
          int rEnd=row-1;
          int cMid= col/1;
          while (rStart< rEnd-1)
          {
           int mid =rStart +(rEnd-rStart)/2;
           // apply cases of the binary  search

              //Case:- 1  If element == target
              if (matrix[mid][cMid]== target)
              {
                  return  new int [] {mid,cMid};
              }

              else if (matrix[mid][cMid]< target)
              {
                 rStart = mid;
              }

              else {
                 rEnd =mid;
              }
              // now we have 2 rows and now check whether we hava target is in the columns 2 rows
              if(matrix[rStart][cMid]== target)
              {
                  return new int []{rStart,mid};
              }  if(matrix[rStart+1][cMid]== target)
              {
                  return new int []{rStart+1,mid};
              }

              // otherwise search in :-
              // 1st half
              if (matrix[rStart][mid-1]<=target)
              {
                  return simpleBNS(matrix,rStart,0,cMid-1,target);
              }
              // 2nd half
              if (matrix[rStart][mid+1]>=target && matrix[rStart][col-1]<=target)
              {
                  return simpleBNS(matrix,rStart,cMid+1,col-1,target);
              }
              // 3rd half
              if (matrix[rStart+1][mid-1]<=target)
              {
                  return simpleBNS(matrix,rStart+1,0,cMid-1,target);
              }
              // 4th half

              if (matrix[rStart+1][mid+1]>=target )
              {
                  return simpleBNS(matrix,rStart+1,cMid+1,col-1,target);
              }





          }
        return new int []{-1,-1};
    }

}

package PatternSolving;

public class PatternProblem {
    public static void main(String[] args) {
//        pattern1(4);
//        System.out.println();
//        pattern2(4);
//        System.out.println();
//        pattern3(4);
//        System.out.println();
//        pattern4(4);
//        pattern5(6);
//        System.out.println();
//        pattern6(5);
//        System.out.println();

//        pattern6(5);
//        System.out.println();
//
//        pattern28(5);
//
////        pattern30(5);
//        pattern17(5);
        pattern18(5);
        pattern31(4);


    }

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = n; col > 0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < (n - row); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }


    static void pattern6(int n) {
        int count =0;
        for (int row = 0; row <2*n; row++)
        {

            int totalColumns = row>n? 2*n-row:row;
            for (int col = 0; col < totalColumns; col++) {
                System.out.print("* ");
            }
            System.out.println();
            count++;
        }
        System.out.println(count);
    }

    static void pattern7(int n) {
        for (int row = 0; row <2*n; row++)
        {

            int totalColumns = row>n? 2*n-row:row;
            for (int col = 0; col < totalColumns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n )
    {
        for (int row =0;row<2*n;row++)
        {
            int totalcolumns= row>n ?2*n-row:row;
            int noOfSpaces = n - totalcolumns;
            for (int s =0;s<noOfSpaces;s++)
            {

                System.out.print(" ");
            }
            for (int col =0;col<totalcolumns;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n )
    {
        for (int row =1;row<=n;row++)
        {
                int totalNoOfSpace= n -row;
            for (int s =1;s<=totalNoOfSpace;s++)
            {
                System.out.print("  ");
            }
            for (int col =row;col>=1;col--)
            {

                System.out.print(col +" ");
            }

            for (int col =2;col<=row;col++)
            {

                System.out.print(col+" ");
            }

            System.out.println();
        }
    }

    static void pattern17(int n )
    {
        for (int row = 1; row <=2*n ; row++) {
            int totalNoOfCol = row>n? 2*n-row:row;
            int totalnoOfSpace =n-totalNoOfCol;
            for (int s =0;s<totalnoOfSpace;s++)
            {
                System.out.print(" ");
            }

            for (int col = 1; col <=totalNoOfCol ; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();

        }
    }

    static void pattern18 (int n )
    {
        for (int row =1;row<=2*n;row++)
        {    int column = row>n? 2*n -row:row;
            int totalNoOfSpace= n -column ;

            for (int s =1;s<=totalNoOfSpace;s++)
            {
                System.out.print("  ");
            }
            for (int col =column;col>=1;col--)
            {

                System.out.print(col +" ");
            }

            for (int col =2;col<=column;col++)
            {

                System.out.print(col+" ");
            }

            System.out.println();
        }
    }

    static void  pattern31(int n )

    { int original= n;
        n = 2*n;
        for (int row  =0 ; row <=n  ; row ++) {

            for (int col=0 ; col <=n  ;  col++) {
                int atEveryIndexVALUE =original - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndexVALUE+" ");
            }

            System.out.println();

        }
    }
}




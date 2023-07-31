package Array_and_Arraylist;

public class maxinArray
{
    public static void main(String[] args) {
        int []arr= {1, 3 ,7 ,9 ,20};
        System.out.println(maxinArray(arr));
        System.out.println(maxRange(arr, 0 ,3));

    }
    static int maxinArray(int []arr){
        int max =arr[0];
        for (int i =0;i<arr.length-1;i++){
//            if (max<arr[i]){
//                max=arr[i];
//            }
            // using the Math Library
            max = Math.max(arr[i],arr[i+1]);
        }
      return  max;
    }

   // find the maxRange
    static int maxRange(int []arr, int start,int end ){
        int max =arr[start];
        for (int i =start;i<= end;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            // using the Math Library
//            max = Math.max(arr[i],arr[i+1]);
        }
        return  max;
    }
}

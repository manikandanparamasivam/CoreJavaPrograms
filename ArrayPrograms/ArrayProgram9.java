package CoreJava.Array;

public class ArrayProgram9 {
    int avg=0;
    public static double findAvg(int[] arr1,int[] arr2){
        int avg=0;
        for (int i=0;i<arr1.length;i++){
            avg=avg+arr1[i];

        }
        for(int i=0;i<arr2.length;i++){
            avg=avg+arr2[i];
        }
        int count=arr1.length+arr2.length;
        avg=avg/count;
        return avg;
    }



    public static void main(String[] args) {
        int[] arr1 = {15, 16, 18, 20};
        int[] arr2 = {25, 27, 30, 35};
        System.out.println(findAvg(arr1,arr2));

    }

}

package CoreJava.Array;

public class ArrayProgram2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int j = 0;
        for (int i = arr.length; 1 > 0; i--) {
            arr[j] = i;
            // System.out.println(arr[j]);
            j++;
            for (int x : arr) {
                System.out.println(x);
            }
        }


    }
}

package CoreJava.Array;

public class ArrayProgram3 {
    public static void main(String[] args) {
        int j = 0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j + 10;
            j++;
        }
        for (int x : arr) {
            System.out.println(x);
        }
    }
}

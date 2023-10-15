package CoreJava.Array;

public class ArrayProgram1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr1 = {10, 20, 30};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println("value" + i + "th box=" + arr[i]);
        }
        for (int x : arr) {
            System.out.println(x);
        }
    }
}

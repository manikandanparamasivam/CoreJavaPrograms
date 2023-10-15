package CoreJava.Array;

public class TestArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("lenth=" + arr.length);

        //for (int i=0;i< arr.length;i++){
        //System.out.println("int a position"+i+"="+arr[i])
        for (int x : arr) {
            System.out.println(x);

            String[] sa = new String[3];
            sa[0] = "hello";
            sa[1] = "mani";
            sa[2] = "kandan";
            for (String s : sa) {
                System.out.println(s);
            }
        }
    }
}

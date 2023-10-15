package CoreJava.Array;

public class ArrayProgram6 {
    public static void main(String[] args) {
        int[] ints=new int[10];
        for(int i=0;i<ints.length;i++){
            ints[i]=i;
        }
        int add = add(ints);
        System.out.println(add);
    }
    public static int add(int[] ints){
        int j=0;
        for (int i = 0; i < ints.length; i++) {

            j=j+ints[i];
        }
        return j;
    }
}

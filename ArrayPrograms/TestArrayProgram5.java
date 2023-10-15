package CoreJava.Array;

public class TestArrayProgram5 {
    public static void main(String[] args) {
          String[] arr=new String[10];
         String[] strings;
        strings = ArrayProgram5.generateRandomNumber(arr);
        for (String s:strings) {
           System.out.println(s);
}

    }
}

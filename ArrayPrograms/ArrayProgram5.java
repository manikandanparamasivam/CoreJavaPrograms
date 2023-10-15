package CoreJava.Array;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.random.RandomGenerator;

public class ArrayProgram5 {
  /* public String[] generateRandomStrings(String[] array) {
        String[] result = new String[10];
        for (int i = 0; i < array.length; i++) {
            byte[] arr = new byte[3];
            new Random().nextBytes(arr);
            String s = new String(arr, Charset.forName("UTF-8"));
            result[i] = s;
            int i = 10
            {
            i = i + 5;
            }
        }
        return result;
    }*/

    public static String[] generateRandomNumber(String[] a2) {
        // 48 to 122
        for(int j=0;j< a2.length;j++){
        String s = "";
        for (int i = 0; i < 3; i++) {
            double random = Math.random();
            double v = random * (122 - 97) + 97;
            char randomNum = (char) v;
            s = s + randomNum;
            ;
        }
        a2[j]=s;
        }
        return a2;
    }
}
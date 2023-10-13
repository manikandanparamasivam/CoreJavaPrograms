package CoreJava.StringProgram;

import java.util.Locale;

public class StringOccurrences {

    public static void main(String[] args) {
        String a = "maki";
        String occ = "m";
        System.out.println("this time Occurrences " + numberOfOccur(a, occ));
    }

    public static int numberOfOccur(String str, String word) {
        int num = 0;
        int count = 0;
        str = str.toLowerCase();
        word = word.toLowerCase();
        boolean flag = true;
        while (flag) {
            num = str.indexOf(word, num);
            if (num != -1)
                count++;
            else
                flag = false;
            num++;
        }
        return count;
    }
}

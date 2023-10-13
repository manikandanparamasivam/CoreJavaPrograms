package CoreJava.StringProgram;

import CoreJava.SumProgram;

public class StringPigLatin {
    public static void main(String[] args) {
        String word = "mani kandan mathi sivam";
        String pig = isPigLatin(word);
        System.out.println(pig);
    }

    public static String isPigLatin(String sen) {
        String sum = "";
        String[] str = sen.split(" ");
        for (int i = 0; i < str.length; i++) {
            sum = sum + str[i].substring(1);
            sum = sum + str[i].substring(0, 1) + "ay" + " ";

        }
        return sum;
    }
}

package CoreJava.StringProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidNumber {
    public static void main(String[] args) {
        String val = "123.23df";
        System.out.println(checkValid(val));
    }

    public static boolean checkValid(String val) {
        String match = "12345678910.0";
        String v = "";
        int count = 0;
        for (int i = 0; i < val.length(); i++) {
            v = String.valueOf(val.charAt(i));
            if (!match.contains(v)) {
                return false;
            }
        }
        return true;
    }

}

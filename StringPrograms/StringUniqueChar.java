package CoreJava.StringProgram;

import java.util.Locale;

public class StringUniqueChar {
    public static void main(String[] args) {
        String unv="maniakdaaaan";
        System.out.println(findUnique(unv));
    }
    public static String findUnique(String unv) {
        unv=unv.toLowerCase();
            String sum = "";
            for (int i = 0; i < unv.length() - 1; i++) {
                char c = unv.charAt(i);
                String v = String.valueOf(c);
                if(!sum.contains(v)) {
                    sum = sum + v;
                }
            }
            return sum;
        }

    }


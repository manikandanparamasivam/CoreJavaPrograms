package CoreJava.StringProgram;

public class Anagram {
    public static void main(String[] args) {
        String s = "mood";
        String s2 = "doom";
        System.out.println(isAnagram(s, s2));
    }

    public static boolean isAnagram(String s1, String s2) {
        char[] charArray1 = s1.toLowerCase().toCharArray();
        char[] charArray2 = s2.toLowerCase().toCharArray();
        if(s1.length() == s2.length()) {
            outer: for (int i = 0; i < charArray1.length; i++) {
                inner: for (int j = 0; j < charArray2.length; j++) {
                    if (charArray1[i] == charArray2[j]) {
                        charArray2[j] = '*';
                        continue outer;
                    }
                }
            }
            for (int i = 0; i < charArray2.length; i++) {
                if(charArray2[i] != '*') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /*
    get count of a character from string
    int (string word, character c) {
    }
     */
}

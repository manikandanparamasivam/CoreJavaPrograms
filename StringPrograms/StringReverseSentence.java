package CoreJava.StringProgram;

public class StringReverseSentence {
    public static void main(String[] args) {
        String rev = "mani kandan sivam";
        String s = reverseSentense(rev);
        System.out.println(s);
    }

    public static String reverseWord(String word) {
        String result = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            result = result + word.charAt(i);
        }
        return result;
    }
    public static String reverseSentense(String str) {
        String[] st = str.split(" ");
        String[] result = new String[st.length];
        for (int i = 0; i < st.length; i++) {
            result[i] = reverseWord(st[i]);
        }
        String res = "";
        for (String s:result) {
            res = res + s + " ";
        }
        return res;
    }
}

package CoreJava.StringProgram;

public class StringSentanceAcronym {
    public static void main(String[] args) {
        String word = "Portable Network Graphics";
        System.out.println(itsAcronym(word));
    }

    public static String itsAcronym(String sen) {
        String sum = "";
        String[] str = sen.split(" ");
        for (int i = 0; i < str.length; i++) {
            sum = sum + str[i].charAt(0);
        }
        return sum;
    }
}

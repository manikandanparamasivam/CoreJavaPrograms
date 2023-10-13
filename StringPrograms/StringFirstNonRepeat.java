package CoreJava.StringProgram;

public class StringFirstNonRepeat {
    public static void main(String[] args) {
        String str = "manimaannaikandan";
        System.out.println(firstNonRepeat(str));
    }

    public static String firstNonRepeat(String sen) {
        sen = sen.toLowerCase();
        String sum = " ";
        String v = " ";
        for (int i = 0; i < sen.length() - 1; i++) {
            v = String.valueOf(sen.charAt(i));
            int i1 = StringOccurrences.numberOfOccur(sen, v);
            if(i1==1){
                return v;
            }
        }
        return null;
    }
}


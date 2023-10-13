package CoreJava.StringProgram;

public class StringCompresses {
    public static void main(String[] args) {
        String str = "manikandan";
        System.out.println(splitMethod(str));
    }

    public static String splitMethod(String spl) {
        String sum = "";
        for (int i = 0; i < spl.length() - 1; i++) {
            char c = spl.charAt(i);
            String v = String.valueOf(c);
            if(!sum.contains(v)) {
                sum = sum + numberOfOccurrences(spl, v);
            }
        }
        return sum;
    }

    public static String numberOfOccurrences(String in, String v) {
        in = in.toLowerCase();
        v = v.toLowerCase();
        int count = 0;
        int num = 0;
        String out = v;
        boolean flag = true;
        while (flag) {
            num = in.indexOf(v, num);
            if (num != -1) {
                count++;
            } else {
                flag = false;
            }
            num++;
        }
        return out+count;
    }
}

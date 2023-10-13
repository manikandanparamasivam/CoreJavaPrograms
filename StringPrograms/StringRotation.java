package CoreJava.StringProgram;

public class StringRotation {
    public static void main(String[] args) {
        String str="manikandan";
        int r=4;
        System.out.println(isRotation(str,r));
        System.out.println(rotateString(str, r));
    }
    public static String isRotation(String ch,int n) {
        String sum="";
        for (int i=ch.length()-1;i>=ch.length()-n;i--)
        {
            char s=ch.charAt(i);
            sum =s+sum;
        }
        for (int j=0;j<ch.length()-n;j++){
            char c=ch.charAt(j);
                    sum=sum+c;
        }
        return  sum;
    }

    public static String rotateString(String word, int n) {
        if(n <= word.length()) {
            return word.substring(word.length() - n) + word.substring(0, word.length() - n);
        }
        return word;
    }
}

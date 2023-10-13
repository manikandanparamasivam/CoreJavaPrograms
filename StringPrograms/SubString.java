package CoreJava.StringProgram;

public class SubString {
    public static void main(String[] args) {
        String a ="manikandan";
        int b= 5;
        System.out.println("this part of SubString "+givenString(a,b));

    }
    public static String givenString(String value,int b){
        String str=value.substring(0,b);
        return str;
    }

}

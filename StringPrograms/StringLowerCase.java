package CoreJava.StringProgram;

public class StringLowerCase {
    public static void main(String[] args) {
        String convert="MANIKANDAN PARAMASIVAM";
        System.out.println("Convert lower Case "+lowerCase(convert));
    }
    public static String lowerCase(String cse) {
        cse=cse.toLowerCase();
        return cse;
    }
}

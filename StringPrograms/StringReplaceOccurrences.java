public class StringReplaceOccurrences
{
    public static void main(String[] args){
        String a="manikandan";
        String b="n";
        String c="s";
        String d=replace(a,b,c);
        System.out.println(d);
    }
    public static String replace(String a,String b,String c){
       String s=a.replace(b,c);
       return s;
    }
}
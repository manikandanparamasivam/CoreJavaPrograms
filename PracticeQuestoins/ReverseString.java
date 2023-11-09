import java.util.*;
//1.How do you reverse a string in Java?
public class ReverseString{
    public static void main(String[] args){
        String w;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a reverse");
        w=scan.nextLine();
        System.out.println(isRevres(w));
    }
    public static String isRevres( String words){
        StringBuilder sb=new StringBuilder(words);
                // System.out.println(sb.reverse());
             sb.reverse();
             String s=sb.toString();
             return s;

    }
}
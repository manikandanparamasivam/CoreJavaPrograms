import java.util.*;
 //Write a Java program to check if a vowel is present in a string.
public class FindVowel{
    public static void main(String[] args){
        String w;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a words");
        w=scan.nextLine();
        System.out.println(isvowel(w));
    }
        public static boolean isvowel(String s){
            boolean b= false;
            s=s.toLowerCase();
            for(int i=0;i<s.length()-1;i++){
                char c=s.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    b=true;
                    break;
                }else{
                    continue;
                }
            }
          
             return b;
        }
}
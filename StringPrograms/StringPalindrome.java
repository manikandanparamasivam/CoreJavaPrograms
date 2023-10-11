public class StringPalindrome
{
    public static void main(String[] args){
        String s="ababA";
        String r=StringReverse.reverse(s);
        if(s.compareTo(r)==0){
            System.out.println("this one Palindrome String "+r);
        }else{
            System.out.println("this not Palindrome String "+r);
        }

    }
    
}
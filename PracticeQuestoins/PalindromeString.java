public class PalindromeString
{
    public static void main(String[] args){
        String words="dad";
        iSPalindrome(words);

    }
    public static void iSPalindrome(String str){
        String rev;
        StringBuilder sb=new StringBuilder(str);
       sb=sb.reverse();
       rev=sb.toString();
       if(sb.equals(str)==true){
        System.out.println("its a palindrome "+rev);
       }
       else{
        System.out.println("its  not palindrome "+rev);
       }

    }
}
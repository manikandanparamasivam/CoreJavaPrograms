public class PalindromeString
{
    public static void main(String[] args){
        String words="mom";
        iSPalindrome(words);

    }
    public static void iSPalindrome(String str){
        String rev;
        StringBulider sb=new StringBulider();
        sb=str
       sb=sb.reverse();
       rev=sb.toString();
       if(rev.equals(str)==true){
        System.out.println("its palindrome "+rev);
       }
       else{
        System.out.println("its palindrome "+rev);
       }

    }
}
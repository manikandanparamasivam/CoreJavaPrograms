
public class PalindromeMethod {

    public static void main(String[] args) {
        int a = 134;
        System.out.println(a + " is " + (isPalindrome(a) ? "a Palindrome" : "not a palindrome"));
        a = 232;
        System.out.println(a + " is " + (isPalindrome(a) ? "a Palindrome" : "not a palindrome"));
        a = -1515;
        System.out.println(a + " is " + (isPalindrome(a) ? "a Palindrome" : "not a palindrome"));
        a = 1245421;
        System.out.println(a + " is " + (isPalindrome(a) ? "a Palindrome" : "not a palindrome"));
    }

    public static boolean isPalindrome(int source) {
        int reversed = reverseAnInteger(source);
        return reversed == source;
    }

    public static int reverseAnInteger(int n) {
        int r = 0;
        int sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        return sum;
    }
}

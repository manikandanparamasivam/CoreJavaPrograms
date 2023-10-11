import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        int n,r,temp;
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your check value");
        n=scan.nextInt();
        temp=n;
        while(n>0)
         {
         r=n%10;
         sum=(sum*10)+r;
         n=n/10;
          
         }
         if(temp==sum){
         System.out.println("this number palindrome");
         }
          else{
          System.out.println(" its not  palindrome" );
          } 
     }
}

import java.util.Scanner;
public class SumProgram {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your value");
        a = scan.nextInt();
        System.out.println(SumProgram.sumDigits(a));


    }
    public static int sumDigits(int a)
    {
         int r=0, sum=0;

         while (a>0)
         {
             r=a%10;
             sum=sum+r;
             a=a/10;
         }
         return sum;
    }
}

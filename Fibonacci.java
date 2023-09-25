import java.util.Scanner;
public class Fibonacci // 0 1 1 2 3 5 8 13
{
    public static void main(String[] args)
    {
        int n1=0;
        int n2=1;
        int sum;
        int a;
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter a your value");
        a=scan.nextInt();

         for (int i=2;i<=a;i++)
         {
            sum=n1+n2; // 1 2 3 5
            System.out.println("your value "+sum);
            n1=n2; // 1 1 2 3
            n2=sum; // 1 2 3 5
         }
    }
}
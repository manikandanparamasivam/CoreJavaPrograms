import java.util.Scanner;
public class NumberPrograms
{
     public static void main(String[]args)
     {
        int a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your tables namber");
        a=scan.nextInt();
        System.out.println("Enter your how many number ");
        b=scan.nextInt();
        for (int i=1;i<=b;i++)
        {
           c=a*i;
           System.out.println(i+"*"+a+"="+c);
        }

     }
}
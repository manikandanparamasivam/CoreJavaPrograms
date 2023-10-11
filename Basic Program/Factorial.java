import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        int a,b=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your a value");
        a=scan.nextInt();
        for(int i=1;i<=a;i++)
        {
            b=b*i;
        }
        System.out.println("your factorial value"+b); 
    }
}
import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[]args)
    {
       int  m=0,flag=0;
       int n;
       Scanner scan=new Scanner(System.in);
       System.out.println("enter our number");
       n=scan.nextInt();
       m=n/2;
       if(n==0||n==1)
       {

       System.out.println(n+"is not an prime num");
       }

       else
       {

       for(int i=2;i<=m;i++)

       {

       if(n%i==0)
       {
       System.out.println(n+"is not prime num");
       flag=1;
       break;
       
       }
       else if(flag==0)
       {
       System.out.println(n+"is  prime num");
       }
       }

       }
       }
       }
       

       

       
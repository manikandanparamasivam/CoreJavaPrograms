import java.util.Scanner;
public class PositiveNagative
{
    public static void main(String[]args)
    {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your n value");
        n=scan.nextInt();

     if(n>0)
     {
        System.out.println("Your value positive");
     }
     else 
     { 
        System.out.println("Your value nagative");
     }

    }
}

import java.util.Scanner;
public class TestAccount
{
    public static void main(String[] args)
    {
        int d=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your value");
        d=scan.nextInt();
       Account h1=new Account();
       h1.setbalance(500);
       h1.withdraw(d);
       System.out.println("Account balance ="+h1.getbalance());
       h1.deposit(d);
       System.out.println("Account balance ="+h1.getbalance());

    }
}
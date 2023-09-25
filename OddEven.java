import java.util.Scanner;
public class OddEven 
{
    public static void main(String[] args)
    {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value");
        a=scan.nextInt();
      if (a%2==0)
      {
        System.out.println("its even number");
      }

      else
      {
        System.out.println("its odd number");
      }

    }
}
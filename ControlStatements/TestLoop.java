import java.util.Scanner;
public class TestLoop
{
   public static void main(String[] args)
   {
     for(int i=1;i<=300;i++)
     {
        if(i%11==0) {
            System.out.println();
        }
        else
        {
        System.out.print(i);
        }
     }
   }
}
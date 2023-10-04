import java.util.Scanner;
public class ControlProgram16
{
public static void main(String[] args)
{
    for(int i=1;i<=65535;i++)
    {
        if(i%5==0)
        {
           System.out.println();
        }
        else{
            System.out.println("this ACII "+(char)i+" ="+i);
        }
    }
}
}
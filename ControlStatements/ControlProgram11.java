import java.util.Scanner;
public class ControlProgram11
{
    public static void main(String[] args)
    {
        int mark=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your mark");
        mark=scan.nextInt();

        if(mark>0 && mark>90)
        {
            System.out.println("Stutent has grate A");
   
        }
        else if(mark>70&& mark<90)
        {
            System.out.println("Stutent has grate B");
        }
        else if(mark>50 && mark<70)
        {
            System.out.println("Stutent has grate C");
        }
        else if(mark>30&& mark<50)
        {
            System.out.println("Stutent has grate D");
        }
        else if(mark<30)
        {
            System.out.println("Stutent has Fail");
        }
    }
}
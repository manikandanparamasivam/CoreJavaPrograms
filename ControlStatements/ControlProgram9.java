import java.util.Scanner;
public class ControlProgram9
{
    public static void main(String[] args)
    {
        int a=0;
        int b=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("your tables value");
        a=scan.nextInt();
      /*for(int i=0;i<10;i++)
        {
            System.out.println(a+"x"+(i+1)+"="+(a*(i+1)));
        }*/
        int i=0;
        /*while(i<10)
        {
          System.out.println(a+"x"+(i+1)+"="+(a*(i+1)));
          i++;
        }*/
       do
        {
        System.out.println(a+"x"+(i+1)+"="+(a*(i+1)));
             i++;
        }while(i<10);
    }

}
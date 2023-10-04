import java.util.Scanner;
public class ControlProgram13
{
    public static void main(String[] args)
    {
        int month=0;
        int year=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the month");
        month=scan.nextInt();
        System.out.println("Enter the year");
        year=scan.nextInt();
        numberDays(month,year);
       
    }

    public static void numberDays(int month,int year)
    {
        if ((month==2)&&(year%4==0)||((year/100!=0)&&(year%400==0)))
        {
            System.out.println("this Month number of days..29");
        }
        
        else if (month==2)
        {
            System.out.println("this Month number of days..28");
        }
        
        else if (month==1 || month==3 || month==5 || month==7 || month==8|| month==10 || month==12)
        {
             System.out.println("this Month number of days..31");
        }

        else
        {
            System.out.println("this Month number of days..30");
        }
    }

}
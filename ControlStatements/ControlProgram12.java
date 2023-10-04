import java.util.Scanner;
public class ControlProgram12
{
    public static void main(String[] args)
    {
        int a=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter year");
        a=scan.nextInt();
        System.out.println(isleapYear(a));
    }
        
     public static boolean isleapYear(int year)
     {
        return (year%100==0)
        ? (year%400==0) ? true : false
        : (year%4==0) ? true : false;
     }


    /* public static boolean isLeapYearIfElse(int year) {
        // (conidition) ? <condition is true> : <condition is false>
        if(year % 100 == 0) {
            if(year % 400 ==0) {
                return true;
            } else {
                return false;
            }
        } else {
            if(year % 4 == 0) {
                return true;
            } else {
                return false;
                return false;
            }
        }*/
     
}

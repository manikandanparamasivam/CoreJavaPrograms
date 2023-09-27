import java.util.Scanner;
public class PrimeNumber2
{
public static void main(String[] args)
{
  int num;
  Scanner scan =new Scanner(System.in);
  System.out.println("Enter your prime value");
  num=scan.nextInt();
  boolean result = isprime(num);
  System.out.println(result);
}

public static boolean isprime(int num)
{
    if(num<0) return false;
    if(num==0||num==1) return false;
    if(num==2||num==3||num==5||num==7) return true;
    if((num&1)==0)return false;
    for(int i=3 ;i<num/2;i+=2)
    {
        if(num%i==0)
        return false; 
    }
    return true; 
}

  
}
import java.util.*;
//Write a Java program to check if the given number is a prime number.
public class PrimeNumber{
    public static void main(String[] args){
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a check Prime number");
        n=scan.nextInt();
        System.out.println(isprime(n));
    }
    public static boolean isprime(int num){
        if(num<0) return false;
        if(num==0||num==1) return false;
        if(num==2||num==3||num==5||num==7) return true;
        for (int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
    }
}
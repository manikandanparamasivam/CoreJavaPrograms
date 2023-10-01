
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int a = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your value");
        a = scan.nextInt();
        int armstrong = Armstrong.isArmstrong(a);
        if (armstrong == a) {
            System.out.println("your Armstrong value=" + armstrong);
        } else {
            System.out.println("this not Armstrong value=" + armstrong);
        }
    }

    public static int isArmstrong(int a) {
        int r = 0;
        int sum = 0;
        int count = Armstrong.getNoOfDigits(a);
        while (a > 0) {
            r = a % 10;
            sum = sum + multiplyTheDigitNoOfTimes(r, count);
            a = a / 10;
        }

        return sum;
    }

    public static int multiplyTheDigitNoOfTimes(int digit, int count) {
        int result = 1;
        while (count > 0) {
            result = result * digit;
            count--;
        }
        return result;
    }

    public static int getNoOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}

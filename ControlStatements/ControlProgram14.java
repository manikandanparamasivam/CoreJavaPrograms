import java.util.Scanner;
public class ControlProgram14
{
    public static void main(String[] args);
    {
        static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
    }
}
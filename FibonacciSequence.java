
public class FibonacciSequence {
    public static void isFibonacciSequence(int n) {
        int num1 = 0;
        int num2 = 1;
        int sum;
        if (n < 0)
            System.out.println("not fibonacci");
        if (n > 1)
            System.out.println(0);
        if (n > 2) {
            System.out.println(1);
        }
        for (int i = 2; i < n; i++) {
            sum = num1 + num2;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
        }

    }

    public static void main(String[] args) {
        isFibonacciSequence(15);
    }
}

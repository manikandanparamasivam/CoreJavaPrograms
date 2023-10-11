public class PerfectSquare {
    public static boolean isPerfect(int a) {
        for (int i = 1; i <= a; i++) {
            int b = i*i;
            if (b == a)
                return true;
            if(b > a)
                break;
        }
        return false;
    }

    public static void main(String[] args) {
        int a=17;
        boolean perfect = PerfectSquare.isPerfect(a);
        System.out.println(perfect);
    }
}

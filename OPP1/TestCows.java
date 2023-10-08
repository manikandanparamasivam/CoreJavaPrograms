package CoreJava.OOP;

public class TestCows {
    public static void main(String[] args) {
        Cows c=new Cows();
        Cows c1=c;
        c.setName("maduuuu");
        c1.moo();
        System.out.println("check name"+c1.getName());
    }
}

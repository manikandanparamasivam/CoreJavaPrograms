public class SwapTwonumber{
 //How do you swap two numbers without using a third variable in Java?
    public  static void main(String[] args){
        int a=20;
        int b=30;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a value "+a+" b value "+b);
    }
}
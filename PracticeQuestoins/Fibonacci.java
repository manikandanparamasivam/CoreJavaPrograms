public class Fibonacci{
        public static void isFibonacciSequence(int count){
        int a=0;
        int b=1;
        int c=0;
            System.out.println(a);
            System.out.println(b);
            for(int i=2;i<=count;i++){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }

        }
         public static void main(String[] args){
            isFibonacciSequence(5);
    } 
}
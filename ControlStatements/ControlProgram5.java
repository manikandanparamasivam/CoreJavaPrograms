public class ControlProgram5 {
    public static void main(String[] args) {
        int n=0;
        int i=1;
       while (i<100)
       {
           n=i+i;
           if (n%10!=0) {
               System.out.println(n);
           }
           ++i;
          if(n==100) break;
       }
    }
}

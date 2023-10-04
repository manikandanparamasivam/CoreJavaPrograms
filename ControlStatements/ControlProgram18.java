public class ControlProgram18
{
    public static void main(String[] args) {
        for(int i=1;i<=6;i++) {  
            if(i!=4 && i!=5) {
                for(int j=1;j<=10;j++) {
                    int num=i*j;
                    System.out.print(num);
                }
                System.out.println();
            }
        }
    }
}

public class SquareHollowPattern
{
    public static void main(String[] args){
        int n=5;
        for(int j=1;j<=n;j++){
        if(j==1||j==n){
        for(int i=1;i<=n;i++){

            System.out.print("*");
        }
         System.out.println("");
        }
        
        else{
            System.out.print("*");
            for(int k=2;k<=n-1;k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        }
    }
}
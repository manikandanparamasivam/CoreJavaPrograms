import java.util.*;
public class BallProgram
{
    public static void main(String[] args){
  
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your colour");
       String colour=scan.nextLine();
        System.out.println("enter your num 1");
       int Ing1=scan.nextInt();
        System.out.println("enter your num2");
       int Ing2=scan.nextInt();
        System.out.println("enter your num3");
       int Ing3=scan.nextInt();
        System.out.println("enter your num4");
       int Ing4=scan.nextInt();
       int[] arr=new int[4];
       arr[0]=Ing1;
       arr[1]=Ing2;
       arr[2]=Ing3;
       arr[3]=Ing4;

       int num=CountBall(arr);
       System.out.println("the colour of ball"+colour+" and count  "+num);

    }
    public static int CountBall(int[] arr)
    {
        int minValue=0;
        int v1,v2,v3,v4;
        if(arr.length==4)
        {
            v1 = arr[0]/5;
            v2 = arr[1]/3;
            v3 = arr[2]/4;
            v4 = arr[3]/2; 
        
        int[] arr2=new int[4];
        arr2[0]=v1;
        arr2[1]=v2;
        arr2[2]=v3;
        arr2[3]=v4;
        minValue = arr2[0];
        for(int i=1;i<arr2.length-1;i++){
            minValue=(minValue<arr[i])?minValue:arr[i];
        }
        }else{
            System.out.println("enter correct number digits");
        }
        return minValue;
    }
    
}
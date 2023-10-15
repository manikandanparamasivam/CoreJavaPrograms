package CoreJava.Array;

import java.util.Random;

public class ArrayProgram7 {
    public static void main(String[] args) {

    String[] strings=new String[5];
    strings[0]=new String("red");
    strings[1]=new String("black");
    strings[2]=new String("orange");
    strings[3]=new String("blue");
    strings[4]=new String("Green");
    for(int i=0;i<20;i++) {
        Random rand=new Random();
        int n1= rand.nextInt(0, 5);
        System.out.println(strings[n1]);
    }

    }
}

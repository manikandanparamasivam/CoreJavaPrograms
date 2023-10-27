 public class ArrayPatternProgram
 {
    int num;
    public ArrayPatternProgram(int num){
        if(num>0){
            this.num=num;
        }
    }
    public void isPattern(){
     String[] str=new String[num];
        String p="";
        for(int i=0;i<str.length;i++){

        // for(int j=1;j<=i;j++){
        str[i]="*";

        p=p+str[i];
        // System.out.print("*");
        System.out.println(p);
        }
        // System.out.println(" ");

        // }
        
    }
   public static void main(String[] args){

    ArrayPatternProgram arr=new ArrayPatternProgram(5);
    arr.isPattern();
    // arr.str=["ss"];

   }

 }
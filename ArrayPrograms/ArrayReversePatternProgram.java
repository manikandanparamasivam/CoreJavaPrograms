public class ArrayReversePatternProgram
{
    int num;
    public ArrayReversePatternProgram(int num){
        if(num>0){
            this.num=num;
        }
    }
    public void isReversePattern(){
     String[] str=new String[num];
        String p="";
        for(int i=0;i<str.length;i++){
             str[i]="*";
        }
        int i=1;
        while(i<=num){

        for(int j=str.length-i;j>=0;j--){
            p=p+str[j];    
        }
        System.out.println(p);
        p="";
        i++;
    }
    }
    public static void main(String[] args){

    ArrayReversePatternProgram arr=new ArrayReversePatternProgram(5);
          arr.isReversePattern();
}

}
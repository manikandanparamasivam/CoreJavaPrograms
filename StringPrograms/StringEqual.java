public class StringEqual{


public static void main(String[] args){
    String a="mani";
    String b="mani";
    System.out.println(checkEqual(a,b));
}

    public static boolean checkEqual(String a,String b)
    {
        int c=a.compareTo(b);
        if(c==0){
            return true;
        }else{
            return false;
        }
    }
}

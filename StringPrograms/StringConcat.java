public class StringConcat
{
    public static void main(String[] args){
        String a="mani";
        String b= "Mathi";
        System.out.println(concat(a,b));
    }
    public static String concat(String a,String b)
    {
        String c=a.concat(b);
        return c;
    }
}
public class StringFindIndex
{
    public static void main(String[] args){

    String a="manikandan";
    String b="d";
    System.out.println(findIndex(a,b));
    }
    public static int findIndex(String a,String b)
    {
        int c=a.indexOf(b,0);
        return c;
    }
}
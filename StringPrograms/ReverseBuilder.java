public class ReverseBuilder{
    public static void main(String[] args)
    {
        String name="maniaknadan";
        System.out.println(revrsBuildr(name));
    }
    public static String revrsBuildr(String rev)
    {
        StringBuilder sb= new StringBuilder(rev);
        sb.reverse();
         return rev=sb.toString();
    }
   
}
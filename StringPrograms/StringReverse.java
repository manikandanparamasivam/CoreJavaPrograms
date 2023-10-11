public class StringReverse{
public static void main(String[] args)
{
    String name = "mani";
    String res=StringReverse.reverse(name);
    System.out.println(res);
}
/*

*/
public static String reverse(String a)
{
    String r = "";
   for(int i=a.length()-1;i>=0;i--){
     r=r+a.charAt(i);
    
   }
   return r;
}
}
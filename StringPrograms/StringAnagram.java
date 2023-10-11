public class StringAnagram
{
    public static void main(String[] args){
        String ch1="maniKANdanParamasivam";
        String cmp="SiVam"
        System.out.println(cheakAnagram(ch1,cmp));
    }
     
    public static boolean cheakAnagram(String ch1,String cmp){
        ch1=ch1.tolowerCase();
        emp=cmp.tolowerCase();
        boolean b=ch1.containds(emp);
        return b;
    }
    
}
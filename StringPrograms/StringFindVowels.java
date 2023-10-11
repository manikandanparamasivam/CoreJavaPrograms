public class StringFindVowels
{
    public static void main(String[] args){
        String a="balajiaaaaiiiijoooo";
        System.out.println(countVowels(a));
        
    }
    public static int countVowels(String a){
        int d =0;
        for(int i=a.length()-1;i>=0;i--){
            char c=a.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                d++;
            }
        }
        return d;
    }
}
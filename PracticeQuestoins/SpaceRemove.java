public class SpaceRemove{
//9. How do you remove leading and trailing spaces from a string in Java?
    public static void main(String[] args){
        String words="  manikandan  ";
        System.out.println(trimSpace(words));

    }

    public static String trimSpace(String trimWords){
        trimWords=trimWords.trim();
        return trimWords;
    }
}
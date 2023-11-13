public class RomoveWhiteSpace{
    public static void main(String[] args){
        String word="mani  kanan  parama sivam ";
        System.out.println(isAllSpaceRemove(word));

    }
    public static String isAllSpaceRemove(String words){
       //cdc words=words.split("\\s","");
        words=words.replaceAll("\\s","");
        return words;
    }
}
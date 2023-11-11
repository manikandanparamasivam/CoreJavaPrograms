public class CheckoddNumber{
    public static void main(String[] args){
    int num=45;
    System.out.println(isonelyodd(num));

    }
        public static boolean isonelyodd(int list){
            int l=list;
            for(int i:l){
                if(i%2==0) return false;
            }
            return true;
        }
}
package CoreJava.StringProgram;
    public class StringRemoveSpaces {
        public static void main(String[] args) {

            String str = "   mani kandan mathi banu ";
            System.out.println(removeSpaces(str));
        }
        public static String removeSpaces(String sp) {
            sp = sp.replaceAll(" ", "");
            return sp;
        }
    }


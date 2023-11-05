public class Printer extends Device{
     public Printer(){
            System.out.println("printer no args constructor");
        }
    public void print(){
        System.out.println("Print a page");
    }
    public void doSomthing(){
        System.out.println("this a printer override method");
    }
}
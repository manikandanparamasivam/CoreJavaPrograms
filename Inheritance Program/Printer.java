public class Printer extends Device{
     public Printer(){
            System.out.println("printer no args constructor");
        }
    public Printer(String n){
            super(n);
            System.out.println("printer parameter constructor");
    }
    public void print(){
        System.out.println(getname()+"Print a page");
    }
    public void doSomthing(){
        System.out.println(getname()+"this a printer override method");
    }
}
public class Microwave extends Device{
    public Microwave(){
        System.out.println("Microwave no args constructor");
    }
    public Microwave(String n){
        super(n);
        System.out.println("Microwave parameter constructor");
    }
    public void cook(){
        System.out.println(getname()+"cook a rice");
    }
    public void doSomthing(){
        System.out.println(getname()+"this a Microwave override method");
    }
}
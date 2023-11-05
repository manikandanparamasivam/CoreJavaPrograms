public class Microwave extends Device{
    public Microwave(){
        System.out.println("Microwave no args constructor");
    }
    public void cook(){
        System.out.println("cook a rice");
    }
    public void doSomthing(){
        System.out.println("this a Microwave override method");
    }
}
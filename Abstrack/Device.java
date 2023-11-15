public  abstract class Device 
{
    public Device(){
        System.out.println("no arg construtor");
    }
    public static void spare(){
        System.out.println("static method Device");
    }
    public  abstract void doSomething();

}
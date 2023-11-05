public class Device{
    String name;
    public Device(){
        System.out.println("this a emty constructor");
    }
    public Device(String str){
        name=str;
        System.out.println("this a parameter constructor");
    }
    public void doSomthing(){
        System.out.println(name+" this a do someting");
    }
}
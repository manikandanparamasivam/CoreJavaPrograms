public class MobilPhone extends Phone
{

    public void doSomething(){
        System.out.println("a phone call doSomthing overridie ");
    }
    public void call(){
        System.out.println("a phone called overridie");
    }
public static void main(String[] args){

    MobilPhone m=new MobilPhone();
    m.call();
    m.doSomething();

}
}
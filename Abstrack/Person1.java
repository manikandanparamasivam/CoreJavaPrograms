public class Person1{
    String name;
    public Person1(){
        this.name=name;
    }
    public void use(Device d){
        d.doSomething();
    }


    public static void main(String[] args){
        MobilPhone m=new MobilPhone();
        Person1 p=new Person1();
        p.use(m);
    }
}
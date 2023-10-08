package CoreJava.OOP;

public class TestDog {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.setSize(11);
        d.setName("Blakieee");
        d.berg();
        System.out.println("dog name="+d.getName()+'\n'+"dog size="+d.getSize());
    }
}

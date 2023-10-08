package CoreJava.OOP;

public class TestPerson {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(71);
        p.setName("mani");
        p.eat();
        p.sleep();
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}

package CoreJava.OOP;

public class Person {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        if(age>0 && age<40){
            System.out.println("eat less...."+name);
        }
        else{
            System.out.println("eat more..."+name);
        }
    }
    public void sleep(){
        if(age>0&&age<40){
            System.out.println("sleep more..."+name);
        }else {
            System.out.println("sleep less..."+name);
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

 public abstract class Jannvar
{
    public Jannvar(String name){
        this.name=name;
         System.out.println("this constractor is a jannvar");
    }
    String name;
    public abstract void eat();
    public void sleep(){
        System.out.println("jannver"+name+"sleeping by keeping eye close");
    }
}

public abstract class Animal{
   private String name;
    public void sleep(){
        System.out.println("Animal can sleep eye close");
    }
    public abstract void eat();
    public Animal(){
        System.out.println("this a no args conetructor");

    }
    public Animal(String name){
        this.name=name;
        System.out.println("this a  args conetructor");
    }
}
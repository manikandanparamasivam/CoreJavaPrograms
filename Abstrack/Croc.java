public class Croc extends Animal
{
public void swim(){
    System.out.println("A swim method");
}
public void eat(){
        System.out.println("Animal eat ...bbb");
    }
public Croc(){
    System.out.println("no argement constructor");
}
public Croc(String name){
    super(name);
    System.out.println("is a argement constructor");
}
}
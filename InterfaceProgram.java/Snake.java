 public class Snake extends Jannvar implements Pet{
    public Snake(String name){
        super(name);
        System.out.println("this constructor is a Snake");

    }
    public void hiss(){
        System.out.println("Snake"+name+"hiss..hiss..hiss");
    }
     public void eat(){
        System.out.println("Snake"+name+"eating sllowoing");
    }
    
     public void play(){
        hiss();
        System.out.println("Snake"+name+"playing by dancing to music");
    }
    public void attack(){
        hiss();
        System.out.println("Snake"+name+"attaking hiss");
    }
    
}
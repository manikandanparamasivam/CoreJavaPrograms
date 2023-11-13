public class Doggie extends Jannvar implements Pet{
    public Doggie(String name){
        super(name);
        System.out.println("this constractor is a doggie");

    }
    public void barg(){
        System.out.println("Doggie"+name+"baring woof ...woof");
    }
     public void eat(){
        System.out.println("Doggie"+name+"eating bone");
    }
    
    // public void play(){
        System.out.println("Doggie"+name+"playing by catching");
    }
    
}
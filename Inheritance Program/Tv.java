public class Tv extends Device{
    public Tv(){
        System.out.println("no tv args constructor");
    }
    public Tv(String n){
        super(n);
        System.out.println(" tv parameter constructor");
    }

    public void watch(){
        System.out.println(getname()+"watch a movie");
    }
    public void doSomthing(){
        System.out.println(getname()+"this a override tv class");
    }
    public void switchChannel(){
        System.out.println(getname()+"switch a channel");
    }
}   
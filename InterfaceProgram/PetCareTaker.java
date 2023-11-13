public class PetCareTaker{
    String name;
    public PetCareTaker(String name){
        this.name=name;
    }
    public void takeCare(Pet p){
        p.play();
        System.out.println("i am CareTaker "+name);

    }
}
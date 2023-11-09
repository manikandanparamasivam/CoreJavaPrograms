public class TestPet{
    public static void main(String[] args){
        System.out.println("pet.x "+Pet.x);
        Pet p1= new Doggie("mani");
        p1.play();
       // p.eat();
       Pet p2=new Snake("nagini");
       p2.play();
       Snake s=(Snake) p2;
       s.play();
       s.sleep();
       s.attack();
       System.out.println("-------------------------------------------------------------");
       PetCareTaker pet=new PetCareTaker("mathi");
       pet.takeCare(p1);
       pet.takeCare(s);
    }
}
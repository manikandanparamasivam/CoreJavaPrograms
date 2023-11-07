public class Vet{
    public void treat(Animal a){
        a.eat();
        a.dance();
        a.sleep();
        
         if(a instanceof Croc){
         Croc c=(Croc) a;
         c.swim();
         } 
         if(a instanceof Hippo){
         Hippo h=(Hippo) a;
         h.smoke();
         }
    }

}
public class TestMechanic{
    public static void main(String[] args){
     Car c=new Car("benze");
   // c.setvehname("benze");
    TwoWheeler t=new TwoWheeler("hreeee");
    System.out.println(t.getvehname());
   // t.setvehname("Hero");
    Mechanic m=new Mechanic();
    m.test(c);
    m.test(t);
    
    }
}
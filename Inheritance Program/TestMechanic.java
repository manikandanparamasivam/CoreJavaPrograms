public class TestMechanic{
    public static void main(String[] args){
    Car c=new Car();
    c.setvehname("benze");
    TwoWheeler t=new TwoWheeler();
    t.setvehname("Hero");
    Mechanic m=new Mechanic();
    m.test(c);
    m.test(t);
    }
}
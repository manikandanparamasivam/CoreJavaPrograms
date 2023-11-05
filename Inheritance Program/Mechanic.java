public class Mechanic{
    public void test(Vechicle v){
        v.start();
        v.drive();
        if(v instanceof Car){
            Car c=(Car) v;
            c.reverse();
        }
        v.stop();
    }
}
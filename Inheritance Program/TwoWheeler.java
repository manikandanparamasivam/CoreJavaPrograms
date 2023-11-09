public class TwoWheeler extends Vechicle {
    public TwoWheeler(String n){
        super(n);
    }
    public void start(){
        System.out.println(getvehname()+"this Start differnt");
    }
    public void drive(){
        System.out.println(getvehname()+"this drive...raceee differnt");
    }

}
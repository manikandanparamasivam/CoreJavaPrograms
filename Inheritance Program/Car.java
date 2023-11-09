public class Car extends Vechicle {
    public Car(String n){
        super(n);
    }
    public void reverse(){
        System.out.println(getvehname()+"is a reverse");
    }
    public  static void start(){
        System.out.println("start car differant");
    }
  /*  public void stop(){
        System.out.println("A vechile"+getvehname()+"Stop");
    }*/
}
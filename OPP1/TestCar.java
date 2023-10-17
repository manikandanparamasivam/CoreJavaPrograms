package CoreJava.OOP;

public class TestCar {
    public static void main(String[] args) {
        Car c=new Car();
        c.setName("Benze");
        c.setFuelQty(2);
        c.setcarStarted(true);
        c.start();
        c.drive();
        System.out.println("car name "+c.getName()+'\n'+"fuel Qty "+ c.getFuelQty()+'\n'+"car status "+c.getiscarStarted());
        c.driven();
        System.out.println("car name "+c.getName()+'\n'+"fuel Qty "+ c.getFuelQty()+'\n'+"car status "+c.getiscarStarted());
        c.driven();
        System.out.println("car name "+c.getName()+'\n'+"fuel Qty "+ c.getFuelQty()+'\n'+"car status "+c.getiscarStarted());
    }
}

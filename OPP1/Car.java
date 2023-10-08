package CoreJava.OOP;

public class Car {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private int fuelQty;

    public void setFuelQty(int fuelQty) {
        this.fuelQty = fuelQty;
    }

    private boolean iscarStarted;

    public void setcarStarted(boolean carStarted) {
        this.iscarStarted =carStarted;
    }

    public void start(){
        if(fuelQty>0){
            iscarStarted =true;
        }
        else {
            System.out.println("check the fuel Qty");
        }
    }
    public void driven(){
        if(iscarStarted ==true) {
            if (fuelQty > 0) {
                System.out.println("I am drive a car name " + name);
                fuelQty--;
            } else if (fuelQty == 0) {
                stop();
            }
        }
    }
    public void  reverse(){
        System.out.println("car reversed");
    }
    public void stop(){
        iscarStarted =false;
        System.out.println("fill the fuel then drive.."+name);
    }

    public String getName() {
        return name;
    }

    public int getFuelQty() {
        return fuelQty;
    }

    public boolean getiscarStarted() {
        return iscarStarted;
    }
}

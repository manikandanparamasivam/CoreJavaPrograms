package CoreJava.OOP;

public class Tv {
    private String name;public void setName(String name) {
        this.name = name;
    }
   private int chNumber;public void setChNumber(int chNumber) {
        this.chNumber = chNumber;
    }
    private int volume;public void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean tvStatus;public void setTvStatus(boolean tvStatus) {
        this.tvStatus = tvStatus;
    }

    public void display() {
        if (tvStatus == true) {
            System.out.println("your Channel NUmber " + chNumber + '\n' + "Your valume range " + volume);
        } else System.out.println("first Swich on tv " + name + " next Access display");
    }

        public void channel(){
            if (tvStatus==true){
                switch(chNumber){
                    case 1: {
                        System.out.println("sun tv");
                        break;
                    }
                    case 2: {
                        System.out.println("ktv tv");
                        break;
                    }
                    case 3: {
                        System.out.println("vijay tv");
                        break;
                    }
                    default:{
                        System.out.println("any one tv play");
                        break;
                    }
                }
            }else {
                System.out.println("enter correct channel number");
            }
        }
        public void isVolume(){
            if(volume>=0 && tvStatus==true){
                System.out.println("your volume "+volume);
            }
        }

    public String getName() {
        return name;
    }
    public int getChNumber() {
        return chNumber;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getisTvStatus() {
        return tvStatus;
    }
}

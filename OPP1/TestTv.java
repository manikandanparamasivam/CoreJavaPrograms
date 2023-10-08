package CoreJava.OOP;

public class TestTv {
    public static void main(String[] args) {
        Tv t=new Tv();
        t.setTvStatus(true);
        t.setName("Oneplus");
        t.setChNumber(3);
        t.setVolume(3);
        t.channel();
        t.isVolume();
        t.display();
        System.out.println("tv status "+ t.getisTvStatus()+'\n'+"tv name "+t.getName()+'\n'+"channel number"+t.getChNumber()+'\n'+"volume range "+t.getVolume());
    }
}

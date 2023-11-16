public class TestMarried {

  public static void main(String[] args) {
    /*   Woman w = new Woman();
    w.setname("rose");
    Man m = new Man();
    m.setname("vijay");
    m.marry(w);
    Woman w2 = new Woman();
    w2.setname("Pinky");
    m.marry(w2);
    m.divorce(w2);
    m.wifeName();
    m.divorce(w);
    m.marry(w2);
    System.out.println(m.getIsMarried());*/
    Man m = new Man();
    m.setname("niyan");
    Woman w = new Woman();
    w.setname("vanitha");
    w.marry(m);
    w.hubbysName();
    System.out.println(w.getIsMarried());
    w.divorce(m);
    System.out.println(w.getIsMarried());
    w.hubbysName();
  }
}

public class Woman {

  private String name;
  private String husband;
  private boolean isMarried = false;

  public void setname(String name) {
    this.name = name;
  }

  public String getname() {
    return name;
  }

  public void setIsMarried(boolean s) {
    this.isMarried = s;
  }

  public boolean getIsMarried() {
    return isMarried;
  }

  public void setHusband(String s) {
    this.husband = s;
  }

  public String getHusband() {
    return husband;
  }

  public void work() {
    System.out.println("a can do a work");
  }

  public void marry(Man m) {
    if (!isMarried) {
       this.husband=m.getname();
      isMarried = true;
      m.setWife(this.name);
      m.setIsMarried(true);
      System.out.println("a woman married " + husband);
    } else {
      System.out.println("this woman already married");
    }
  }

  public void divorce(Man m) {
    if(isMarried==true){
    this.husband = null;
    this.isMarried = false;
    m.setWife(null);
    m.setIsMarried(false);
    System.out.println("divorce successful");
    } else {
      System.out.println("this woman not married so connot be divorce");
    }
  }

  public void hubbysName() {
    if (isMarried == true) {
      System.out.println("a husband name " + this.husband);
    } else {
      System.out.println("this woman not married");
    }
  }
}

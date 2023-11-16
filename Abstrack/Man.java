public class Man {

  private String name;
  private String wife;
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

  public void setWife(String s) {
    this.wife = s;
  }

  public String getWife() {
    return wife;
  }

  public void eat() {
    System.out.println("a man can eat ...food");
  }

  public void marry(Woman w) {
    if (!this.isMarried) {
      this.isMarried = true;
      this.wife = w.getname();
      w.setHusband(this.name);
      w.setIsMarried(true);
      System.out.println("this man marrage " + w.getname());
    } else {
      System.out.println("this man already married");
    }
  }

  public void divorce(Woman w) {
    if (isMarried == true) {
      w.setHusband(null);
      w.setIsMarried(false);
      this.isMarried = false;
      this.wife = null;
      System.out.println("divorce successful");
    } else {
      System.out.println("this man not married so connot be divorce");
    }
  }

  public void wifeName() {
    if (isMarried == true) {
      System.out.println("a wife name" + this.wife);
    } else {
      System.out.println("this man not married");
    }
  }
}

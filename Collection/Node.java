public class Node {

  private String data;
  private Node next;
  private long position;

  public Node() {
  }

  public Node(String data, long position) {
    super();
    if (data != null && position >= 0)
      this.data = data;
    this.position = position;
  }

  public void setdata(String data) {
    this.data = data;
  }

  public String getdata() {
    return data;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getnext() {
    return next;
  }

  public void setposition(long position) {
    this.position = position;
  }

  public long getposition() {
    return position;
  }

}

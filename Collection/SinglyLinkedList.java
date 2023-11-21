public class SinglyLinkedList implements LinkedList {

  private Node head;
  private Node last;
  private long size;

  public void add(String data) {
    Node n = new Node(data, size);
    if (head == null) {
      head = n;
      last = n;
    } else {
      last.setNext(n);
      last = n;
    }
    size++;
  }

  public void print() {
    if (head == null) {
      System.out.println("first add value and say print");
    } else {
      Node temp = head;
      while (temp != null) {
        System.out.println(
          "this a data" + temp.getdata() + " position of " + temp.getposition()
        );
        temp = temp.getnext();
      }
    }
  }

  public boolean isempty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

  public long size() {
    return size;
  }
}

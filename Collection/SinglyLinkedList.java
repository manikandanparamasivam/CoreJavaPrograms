public class SinglyLinkedList implements LinkedList {

  private Node head;
  private Node last;
  private long size;

	public void add(String data) {
		// TODO Auto-generated method stub
		Node n = new Node(data, size);
		if (head == null) {
			head = last = n;
		} else {
			if (head != null && last != null) {
				last.setNext(n);
				last = n;
			}
		}
		size++;
	}

	
	public long size() {
		// TODO Auto-generated method stub
		return size;
	}

	
	public boolean isemty() {
		// TODO Auto-generated method stub
		if (size == 0) {
			return true;
		}
		return false;
	}

	
	public boolean contains(String data) {
		// TODO Auto-generated method stub
		Node temp = head;
		while (temp.getNext()!= null) {
			if (temp.getData().equals(data))
				return true;
			temp = temp.getNext();
		}
		return false;
	}

	
	public void insert(int position, String data) {
		// TODO Auto-generated method stub
		Node n = new Node(data, position);
		Node temp = head;
		Node previous = head;
		while (temp != null) {
			if (temp.getPosition() == position) {
				n.setNext(temp.getNext());
				previous.setNext(n);
				temp.setNext(null);
			} else {
				previous = temp;
				temp = temp.getNext();
			}
		}
	}

	
	public void clear() {
		// TODO Auto-generated method stub
		if (head != null && last != null) {
			head = null;
			last = null;
			size = 0;
		} else {
			System.out.println("thare is not data");
		}
	}

	
	public void remove(int position) {
		// TODO Auto-generated method stub
		if (size == 0 && position == 0) {
			head = last = null;
		 }
		if (position > 0) {
			Node temp = head.getNext();
			Node previous = temp;
			while (temp.getNext() != null) {
				if (temp.getPosition() == position) {
					previous.setNext(temp.getNext());
					temp.setNext(null);
				} else {
					previous = temp;
					temp = temp.getNext();
				}
			}
			size--;
		}
	}
	public void remove(String data) {
		 if (head.getData().equals(data)) {
				head = last = null;
			}
			if (data != null) {
				Node temp = head;
				Node previous = null;
				while (temp.getData() != data && temp.getNext() != null) {
					previous = temp;
					temp = temp.getNext();
					if (temp.getNext() != null && temp.getData() == data) {
						previous.setNext(temp.getNext());
						temp.setNext(null);
					}
				}
				size--;
			} else {
				System.out.println("check a data");
			}
	}

	public String get(int position) {
		if(position==0)return head.getData();
		else if(position>=1&&position<=last.getPosition()) {
			Node temp=head.getNext();
			while(temp.getNext()!=null) {
				if(temp.getPosition()==position) {
					return temp.getData();	
				}
			}
			return "";
		}
		else {
			return "";
		}
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

 

 
}

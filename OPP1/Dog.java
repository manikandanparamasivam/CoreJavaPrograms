package CoreJava.OOP;

public class Dog {
    private int size;
    public void setSize(int size) {
        this.size = size;
    }
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void berg()
    {
        if(size>0&&size>10){
            System.out.println("meows...meows "+name);
        }
        else if(size>0&&size<=10){
            System.out.println("bow wow....bow woww "+name);
    }
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}


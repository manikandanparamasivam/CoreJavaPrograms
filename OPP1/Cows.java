package CoreJava.OOP;

public class Cows {
    private String name;

    public String setName(String name) {
        this.name = name;
        return name;
    }


    public  void moo()
    {
        System.out.println("I am cow and I am moo mooing..."+ name);
    }

    public String getName() {
        return name;
    }
}

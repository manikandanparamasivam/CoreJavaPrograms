public class Crocs
{
     private String name;
    public void setname(String a)
    {
        name=a;
    }
    
     public void eat(Fish f)
    {
        System.out.println("I ma a crocs "+name+" eating by "+f.getname());
        f.fish();
    }
    public String getname()
    {
        return name;
    }
}
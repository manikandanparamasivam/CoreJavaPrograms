public class TestVet{
    public static void main(String[] args){
        Vet v=new Vet();
        Croc c=new Croc();
        c.setname("kaka");
        Hippo h=new Hippo();
        h.setname("Nipoo");
        v.treat(c);
        v.treat(h);

    }
}
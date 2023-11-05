public class TestDevice{
    public static void main(String[] args){
       Device d=new Device();
        d.name="diyaa";
        d.doSomthing();
        Device a=new Device("monie");
        a.doSomthing();
        Device n=new Tv();
        n.doSomthing();
        Tv t=(Tv) n;
        t.switchChannel();
        System.out.println(n.name);

        Device p= new Printer();
        p.doSomthing();

        Device m=new Microwave();
        m.doSomthing();



    }
}
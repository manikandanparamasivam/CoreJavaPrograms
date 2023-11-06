public class TestDevice{
    public static void main(String[] args){
      /* Device d=new Device();
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
        m.doSomthing();*/
       /* Device d=new Tv();
        d.doSomthing();
        d=new Printer();
        d.doSomthing();
        d=new Microwave();
        d.doSomthing();
        Device d=new Tv(); 
        System.out.println("d intance Of Microwave?"+(d instanceof Microwave));
        System.out.println("d intance Of Printer?"+(d instanceof Printer));
        System.out.println("d intance Of Tv?"+(d instanceof Tv));
        System.out.println("d intance Of Device?"+(d instanceof Device));
       // System.out.println("d intance Of String?"+(d instanceof String));*/
       Electrician e=new Electrician();
       Tv t=new Tv();
       t.setname("LG");
       System.out.println("tv name "+t.getname());
       Printer p=new Printer();
       p.setname("HP");
       System.out.println("Printer name "+p.getname());
       Microwave m=new Microwave();
       m.setname("Hitachi");
       System.out.println("Microwave name "+m.getname());
       e.TestDevice(t);
       e.TestDevice(p);
       e.TestDevice(m);

       Tv t1=new Tv("oneplus");
       System.out.println("tv name "+t1.getname());
       e.TestDevice(t1);

    }
}
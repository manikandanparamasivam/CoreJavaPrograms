public class Device{
     private String name;
     public void setname(String name){
        this.name=name;
     }
     public String getname(){
        return name;
     }
     
    public Device(){
        System.out.println("this a  device emty constructor");
    } ..

    public Device(String str){
        name=str;
        System.out.println("this a parameter constructor");
    }
    public void doSomthing(){
        System.out.println(name+" this a do someting");
    }
}
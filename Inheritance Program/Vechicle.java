public class Vechicle
{
    private String vehname;
    public void setvehname(String vehname){
        this.vehname=vehname;
    }
    public String getvehname(){
        return vehname;
    }

    public void start(){
        System.out.println("A vechile"+vehname+" started");
    }
    public void drive(){
        System.out.println("A vechile"+vehname+"drive");
    }
    public void stop(){
        System.out.println("A vechile"+vehname+"Stop");
    }

}
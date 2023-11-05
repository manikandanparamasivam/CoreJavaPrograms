public class Vechicle
{
    private String vehname;
    public void setvehname(String vehname){
        if(vehname!=null&&!vehname.equals("")){
           this.vehname=vehname;
        }
        else{
            System.out.println("enter correct value");
        }
        
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
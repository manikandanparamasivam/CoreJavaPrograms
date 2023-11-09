public class  Vechicle 
{
    private final String vehname;
    public Vechicle(String a){
        this.vehname=a;
    }
   /* public void setvehname(String vehname){
        if(vehname!=null&&!vehname.equals("")){
           this.vehname=vehname;
        }
        else{
            System.out.println("enter correct value");
        }
        
    }*/
    public String getvehname(){
        return vehname;
    }

    public static void start(){
        System.out.println("A vechile started");
    }
    public void drive(){
        System.out.println("A vechile"+vehname+"drive");
    }
    public final void  stop(){
        System.out.println("A vechile"+vehname+"Stop");
    }

}
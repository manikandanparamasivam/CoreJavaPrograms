public class Address{
    private String homeaddress;
    private String officeaddress;
    int count;
    public Address(){
        System.out.println("defult construtor");
    }
    public void set(String homeaddress){
        this.homeaddress=homeaddress;
    }
    public void set(String officeaddress){
        this.officeaddress=officeaddress;
    }
    public String gethomeaddess(){
        return homeaddress;
    }
     public String getofficeaddress(){
        return officeaddress;
    }
     public Address(String home,String office){
        this.homeaddress=home;
        this.officeaddress=office;
        System.out.println("parameter construtor");
    }
    public boolean equeals(Object o){
        if(o>0&&O<){
            if(o.instanceof Address){
                Address=Address(o);
                 o.equeals();
            }
           
        }

    }




}
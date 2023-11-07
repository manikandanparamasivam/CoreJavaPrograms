public  class Animal{
     private String name;
     public void setname(String name){
        if(name!=null&&name!=""){
            this.name=name;
        }
     }
     public String getname(){
        return name;
     }

    public void eat(){
        System.out.println(name+" eating cha..");
    }
    public void sleep(){
        System.out.println(name+" sleep...zzzz..zzzz ..Snores");
    }
    public void dance(){
        System.out.println(name+" dance...&");
    }
}
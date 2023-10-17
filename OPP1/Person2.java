public class Person2{
    
    private String name;
    private int age;
    public void setame(String name){
        if(name!=null&&name.length()>30){
            this.name=name;
        }else{
            System.out.println("enter a correct value");
        }
    }
     public void setage(int age){
        if(age>0&&age>30){
            this.age=age;
        }else{
            System.out.println("enter a correct value");
        }
    }

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
   
    public Person2(){
        System.out.println("this a No args constractor");
    }
     public Person2(String name){
        if(name!=null&&name.length()>30){
            this.name=name;
        }else{
            System.out.println("enter a correct value");
        }
        System.out.println("this a parameter constractor");
    }
     public Person2(int age){
         if(age>0&&age>30){
            this.age=age;
        }else{
            System.out.println("enter a correct value");
        }
        System.out.println("this a parameter constractor");
    }
    public Person2(int age,String name){
        if(name!=null&&name.length()>30){
            this.name=name;
        }else{
            System.out.println("enter a correct value");
        }
        if(age>0&&age>30){
            this.age=age;
        }else{
            System.out.println("enter a correct value");
        }

    }
    
    }

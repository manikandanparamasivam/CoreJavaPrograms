public class Person3
{
    private String name;
    public Person3(String name){
        
          this.name=name;
    }

    public void commute(Car c,String destination){
        if(destination !=null && destination!=""){
        c.start();
        c.drive();
        c.reverse();
        System.out.println("reached to "+destination);
        }else{
             System.out.println("its destination is not proper");

        }
    }
    public void sing(Song s){
        s.playSong();
    }
    public void walk(Dog d){
        d.berg();
    }
    public void food(Person p1,String foodname){
       if(foodname!=null&&foodname!=""){
        p1.eat();
        System.out.println("food name "+foodname);
       }else{
         System.out.println("its foodname is not proper");
       }
    }
    public void generatePrime(PrimeNumber2 pre,int num){
        if(num>0){
        boolean ans=pre.isprime(num);
         System.out.println("your Prime number "+num+ans);
        }else{
            System.out.println("its is not proper number");
        }
    }



 public static void main(String[] args){
    Person3 p=new Person3("mani");
    Car c=new Car();
    c.setname("Benze");
    c.setFuelQty(1);
    c.setiscarStarted(true);
    Song s=new Song();
    s.setSongName("Habiboo");
    s.setLyrics("Malama Pitha Pithadhe Malama Pitha Pithadhe Mala Pitha Pithadhe Malama Pithadhe");
    Dog d=new Dog();
    d.setSize(5);
    d.setname("blackie");
    Person p1=new Person();
    p1.setAge(35);
    p1.setname("mani");
    PrimeNumber2 pre= new PrimeNumber2();

    p.commute(c,"tvmalai");
    p.sing(s);
    p.walk(d);
    p.food(p1,"veg rice");
    p.generatePrime(pre,8);
 }

}
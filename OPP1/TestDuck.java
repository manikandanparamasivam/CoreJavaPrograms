public class TestDuck
{
    public static void main(String[] args)
    {
         Duck d1=new Duck();
         Duck d2=new Duck();
         d1.settailsize(30);
         d2.settailsize(20);
         d1.swim();
         d2.swim();
         d1=d2;
         d1=d2=null;
         d1=new Duck();
         d1.settailsize(30);
         d1.swim();

        //d1.settailsize(d2.gettailsize());
        //d1.swim();


         //System.out.println(d1.gettailsize());
         //System.out.println(d2.gettailsize());
    }
}
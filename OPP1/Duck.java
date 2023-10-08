public class Duck
{
   private int tailsize;
   public void settailsize(int a)
   {
       if(a>0)
       {
        tailsize=a;
       }
   }

    public void swim()
    {
        System.out.println("swim the duck..." + tailsize);
    }

    public int gettailsize()
    {
        return tailsize;
    }
}
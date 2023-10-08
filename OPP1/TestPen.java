public class TestPen
{
    public static void main(String[] args)
    {
    Pen p1=new Pen();
  // System.out.println("p1.name="+p1.name+"  inkQty="+p1.inkQty);
   p1.name="camlen";
  // p1.inkQty=2;
   p1.setinQty(2);
   p1.Write("hello Maikandan Paramasivm ");
   System.out.println("p1.name="+p1.name+"   inkQty="+p1.getinkQty());
    p1.Write("can i do this somthing ");
    System.out.println("p1.name="+p1.name+"  inkQty="+p1.getinkQty());
    p1.Write("Anyway calling for me");
    System.out.println("p1.name="+p1.name+"  inkQty="+p1.getinkQty());

    }

}
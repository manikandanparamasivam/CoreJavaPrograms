public class Pen
{
    private int inkQty;
    String name;
    String color;
    public void setinQty(int b)
    {
        if(b>0 && b<=25)
        inkQty=b;
        else{
        System.out.println("Enter a Postive value and inkQty Allow to 1-25");
    }
    }
    

    public void Write( String data)
    {


        if(inkQty>0)
        {
            System.out.println("Pen"+name+"writing"+data);
            inkQty--;
        }
        else{
            System.out.println("First Fill ink,then Write");
        }
    }

    public int getinkQty()
    {
        return inkQty;
    }
}
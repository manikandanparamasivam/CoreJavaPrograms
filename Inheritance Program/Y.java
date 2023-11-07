public class Y extends X{
    int c=10;
    static int d=25;
     
    static{
        System.out.println("in static init 1 of Y d="+d);
        d=35;
    }
    static
    {
        System.out.println("in static init 2 of Y d="+d);
        d=45;

    }
     {
        System.out.println("in inst init 1 of Y c="+c);
        c=20;
    }
    
    {
       System.out.println("in inst init 2 of Y c="+c);
        c=30;
    }
    public Y(){
        System.out.println("in constr of Y c="+c);
        c=40;
    }
    public Y(int y){
        super(y);
        System.out.println("in  Y param constr of y="+y);
        c=y;
    }
}
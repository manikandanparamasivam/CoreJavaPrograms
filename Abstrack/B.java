public class B extends A{
    static String name;

    public B(String name){
        super(name);
       this.name=name;
       System.out.println("parameter constructer B class");
      }
      public void print(){
         System.out.println( "B name "+name);
      }


}
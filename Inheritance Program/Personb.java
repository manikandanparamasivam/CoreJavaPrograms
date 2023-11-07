public class Personb{
     private String name;

    Account acc;
    private String productname;
    private double amount;
    
    public void setname(String name){
        this.productname=productname;
    }
    public String getname(){
        return name;
    }
    public void setproductname(String productname){
        this.productname=productname;
    }
    public String getproductname(){
        return productname;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }
     public Personb(Account a){
        acc=a;
    }
    public void Buyitems(){
       // Account a=(Account) acc;
        System.out.println(acc.getbalance());
        if(acc.checkbalance()>amount){
        System.out.println(name+"give this Item");
        acc.withdraw(amount);
         System.out.println(amount+"this price a item");
        }
        else{
            System.out.println("your bank balance lower then");
        }

    }
}
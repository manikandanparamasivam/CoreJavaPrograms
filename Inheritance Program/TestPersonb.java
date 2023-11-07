public class TestPersonb{
    public static void main(String[] args){
        Account a=new Account();
        a.setbalance(1000);
        BankAccount b=new BankAccount();
        b.setbalance(2000);
        CreditCardAccount c=new CreditCardAccount();
        c.setbalance(1500);
        c.maxBalance();
        c.minBalance();
        Personb p=new Personb(c);
        p.setname("nithya");
        System.out.println(p.getname());
        p.setproductname("ball");
        System.out.println(p.getproductname());
        p.setAmount(350);
        p.Buyitems();
    }
}
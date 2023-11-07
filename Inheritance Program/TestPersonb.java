public class TestPersonb{
    public static void main(String[] args){
        Account a=new Account();
        a.setbalance(1000);
        BankAccount b=new BankAccount();
        CreditCardAccount c=new CreditCardAccount();
        c.maxBalance();
        c.minBalance();
        Personb p=new Personb(c);
        p.setname("nithya");
        p.setproductname("ball");
        p.setAmount(350);
        p.Buyitems();
    }
}
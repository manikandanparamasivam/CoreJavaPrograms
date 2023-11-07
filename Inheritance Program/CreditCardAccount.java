public class CreditCardAccount extends Account{
    public void maxBalance(){
        if(getbalance()<75000){
            System.out.println("this account max Amount limit 75,000");
        }else{
            System.out.println("a max balance 75,000");
        }
    }
    public void minBalance(){
        System.out.println("a min balance can be nagative");
    }

}
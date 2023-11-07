public class BankAccount extends Account{
    public void maxBalance(){
        if(getbalance()<50000){
        System.out.println("this account max Amount limit 50,000");
        }else{
            System.out.println("this max balance 50,000 only");
        }
    }
     public void minBalance(){
        if(getbalance()>500){
            System.out.println("this Account  min balance 500");
        }else{
             System.out.println("please main min balance max 500");
        }
       
    }
}
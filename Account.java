public class Account
{
    private double balance;
    public void setbalance(double i)
    {
        if(i>0)
        {
         balance=i;
        }
        else{
            System.out.println("ignore a nagative value");
        }

    }

    public void withdraw(double i)
    {  
        if(i>0){
        balance=balance-i;
        }
       else
       {
        System.out.println("Enter the postive value");
       }
    }

    public void deposit(double i)
    {  
        if(i>0){
        balance=balance+i;
        }
       else
       {
        System.out.println("Enter the postive value");
       }
    }

    public double getbalance()
    {
        return balance;
    }
}
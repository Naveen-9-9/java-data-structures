class BankAccount{
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
        System.out.println(  "Bank Account Created for "+accountHolder+ " with balance "+balance);
    }
    void calculateInterest(){
        System.out.println("Savings Account Created ");
    }
}

class SavingsAccount extends BankAccount{

    SavingsAccount(String accountHolder,double balance){
        super(accountHolder, balance);
        System.out.println("savings account is created ");
    }
    
    @Override
    void calculateInterest(){
        
        balance = balance * 0.04;
        System.out.println("Interest for Savings Account:" + balance);
    }
    
}

class CurrentAccount extends BankAccount{
    
    CurrentAccount(String accountHolder, double balance){
        super(accountHolder, balance);
        System.out.println("Current account is created ");
    }
    
    @Override
    void calculateInterest(){
        
        balance = balance * 0 ;
        System.out.println("Interest for Current Account:" + balance);
    }

}

public class Problem4 {

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("Bunny", 5000.0);
        s.calculateInterest();
        CurrentAccount c = new CurrentAccount("Ramesh", 10000);
        c.calculateInterest();
    }
}
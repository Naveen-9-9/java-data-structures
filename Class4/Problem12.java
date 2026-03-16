class Account {
    int wallet ;
    String ownerName ;
    double balance;
    int transactionCount;
    
    Account(int wallet,double balance, String ownerName){
        this.wallet = wallet;
        this.ownerName = ownerName;
        this.balance = balance;
        this.transactionCount = 0 ;
    }
    
    public int getWalletId(){
        return wallet;
    }
    public void setWalletId(){
        this.wallet = wallet;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(){
        this.ownerName = ownerName;
    }
    public double getBalance(){
        return  balance;
    }
    public int getTransactionCount() {
        return transactionCount;
    }
    
    public void addMoney(double amount) {
        balance +=amount;
        transactionCount++;
    }
    public void makePayment(double amount){
        if (amount <= balance) {
            balance -= amount;
        }
        transactionCount++;
    }
    public void displayWalletInfo(){
        System.out.println("wallet :" + wallet);
        System.out.println("ownerName :" + ownerName);
        System.out.println("balance :" + balance);
        System.out.println("transactionCount :" + transactionCount);
    }
}

public class Problem12{
    public static void main(String[] args) {
        Account ac = new Account(101, 5000, "Priya");
        ac.addMoney(1500);
        ac.makePayment(2000);
        ac.displayWalletInfo();
    }
}


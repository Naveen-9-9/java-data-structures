abstract class ATM {
    void withdraw(double Amount) {
    }
    void deposite(double Amount){
    }
    void checkBalance(){
    }
}

class BankATM extends ATM{
    double initalBalance;

    BankATM(double initalBalance){
        this.initalBalance = initalBalance;
        System.out.println("Initial Balance: " + initalBalance);
    }

    
    void withdraw(double Amount){
        if (initalBalance < Amount) {
            System.out.println("Your amount is insufficient to withdraw");
        }
        else {
            System.out.println(Amount+" withdrawn successfully. ");
            initalBalance -=Amount;
        }
    }

    void deposite(double Amount){
        initalBalance += Amount;
        System.out.println(Amount + " deposited successfully. ");
    }
    void checkBalance(){
        System.out.println("Currently Your Balance are :" + this.initalBalance);
    }
}



public class Problem5 {
    public static void main(String[] args) {
        BankATM bk = new BankATM(5000);
        bk.withdraw(1000);
        bk.deposite(2000);
        bk.checkBalance();
    }
}

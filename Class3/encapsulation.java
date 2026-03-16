class BankAccount {
    private int Balance = 1234567890;

    int ShowBalance(){
        return Balance;
    }
    int deposit(int amount){
        return Balance += amount;
    }

}
public class encapsulation {

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        System.out.println("Balance : "+ b.ShowBalance());
        System.out.println("Balance Added: "+ b.deposit(100000));

    }
}
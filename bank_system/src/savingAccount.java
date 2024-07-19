import java.util.List;

public class SavingAccount extends BankAccount {
    private double interest_rate; 

    public SavingAccount(String customer_name, int account_number, int balance, double interest_rate){
        super(customer_name, "Savings", account_number, balance);
        this.interest_rate = interest_rate;
    }

    // Getter for interest rate
       public double getInterestRate() {
        return interest_rate;
    }

    // Setter for interest rate
    public void setInterestRate(double interest_rate) {
        this.interest_rate = interest_rate;
    } 

    @Override
    public void monthlyMaintenance() {
        int interest = (int) (getBalance() * interest_rate);
        deposit(interest);
        System.out.println("Interest added" + interest + ". New balance: " + getBalance());
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited " + amount + ". New balance: " + getBalance());
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + ". New balance: " + getBalance());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    @Override
    public List<String> getTransactionHistory(){
        return super.getTransactionHistory();
    }
}

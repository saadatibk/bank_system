import java.util.List;

public class CheckingAccount extends BankAccount {
    private int fee;

    public CheckingAccount(String customer_name, int account_number, int balance, int fee){
        super(customer_name, "Checking", account_number, balance);
        this.fee = fee;
    }

    // Getter for fee
    public int getFee() {
        return fee;
    }

    // Setter for fee
    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            int netDeposit = amount - fee;
            if (netDeposit > 0) {
                deposit(netDeposit);
                getTransactionHistory().add("Deposit: " + amount + " (Fee: " + fee + ")");
                System.out.println("Deposited " + netDeposit + " after fee. New balance: " + getBalance());
            } else {
                System.out.println("Deposit amount must be greater than the fee.");
            }
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0 && getBalance() >= amount + fee) {
            setBalance(getBalance() - amount - fee);
            getTransactionHistory().add("Withdrawal: " + amount + " (Fee: " + fee + ")");
            System.out.println("Withdrew " + amount + " after fee. New balance: " + getBalance());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    @Override
    public List<String> getTransactionHistory(){
        return super.getTransactionHistory();
    }

    @Override
    public void monthlyMaintenance(){
        withdraw(fee);
        getTransactionHistory().add("Monthly Maintenance Fee: " + fee);
    }

}

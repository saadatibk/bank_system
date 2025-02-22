import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public abstract class bankAccount {
    private String customer_name;
    private String account_type;
    private int account_number;
    private int balance;
    public List<String> transactionHistory;

    public bankAccount(String customer_name, String account_type, int account_number, int balance){
        this.customer_name = customer_name;
        this.account_type = account_type;
        this.account_number = account_number;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    //getter for name
    public String getName() {
        return customer_name;
    }

    //setter for name
    public void setName(String customer_name){
        this.customer_name = customer_name;
    }

     // Getter for account type
     public String getAccountType() {
        return account_type;
    }

    // Setter for account type
    public void setAccountType(String account_type){
        this.account_type = account_type;
    }

    // Getter for account number
    public int getAccountNumber() {
        return account_number;
    }

    // Setter for account number
    public void setAccountNumber(int account_number){
        this.account_number = account_number;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(int balance){
        this.balance = balance;
    }

    // Abstract methods for deposit and withdrawal
    public void deposit(int amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        transactionHistory.add("Deposit: " + amount);
    }
    public void withdraw(int amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
        transactionHistory.add("Withdrawal: " + amount);
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public abstract void monthlyMaintenance();
}

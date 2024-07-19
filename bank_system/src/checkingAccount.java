public class checkingAccount extends bankAccount {
    private int fee;

    public checkingAccount(String customer_name, String account_type, int account_number, int balance, int fee){
        super(customer_name, account_type, account_number, balance);
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

    public void processDeposit(int amount) {
        if (amount > 0) {
            int netDeposit = amount - fee;
            if (netDeposit > 0) {
                deposit(netDeposit);
            } else {
                System.out.println("Deposit amount must be greater than the fee.");
            }
        } else {
            System.out.println("Deposit amount must be positive.");
        }
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
    public void withdrawal(int amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + ". New balance: " + getBalance());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

}

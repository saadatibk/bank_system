public class savingAccount extends bankAccount {
    private int interest_rate; //interest rate in percentage

    public savingAccount(String customer_name, String account_type, int account_number, int balance, int interest_rate){
        super(customer_name, account_type, account_number, balance);
        this.interest_rate = interest_rate;
    }

    // Getter for interest rate
       public int getInterestRate() {
        return interest_rate;
    }

    // Setter for interest rate
    public void setInterestRate(int interest_rate) {
        this.interest_rate = interest_rate;
    } 

    public void calculateInterest(){
        int interest = (getBalance() * interest_rate) / 100;
        setBalance(getBalance() + interest);
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
    public void withdrawal(int amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + ". New balance: " + getBalance());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

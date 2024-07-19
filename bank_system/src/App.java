public class App {
    public static void main(String[] args) throws Exception {
       CheckingAccount checkingAcc = new CheckingAccount("Saadat", "checking", 001, 0, 0);
       checkingAcc.processDeposit(1000);
       checkingAcc.withdrawal(250);

       SavingAccount savingAcc = new SavingAccount("Tom", "saving", 002, 250, 3);
       savingAcc.calculateInterest();
       savingAcc.deposit(100);
       
    }
}

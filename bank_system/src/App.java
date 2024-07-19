public class App {
    public static void main(String[] args) throws Exception {
       checkingAccount checkingAcc = new checkingAccount("Saadat", "checking", 001, 0, 0);
       checkingAcc.processDeposit(1000);
       checkingAcc.withdrawal(250);

       savingAccount savingAcc = new savingAccount("Tom", "saving", 002, 250, 3);
       savingAcc.calculateInterest();
       savingAcc.deposit(100);
       
    }
}

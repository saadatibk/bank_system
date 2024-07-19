public class App {
    public static void main(String[] args) throws Exception {
       CheckingAccount checkingAcc = new CheckingAccount("Saadat", 001, 0, 12);
       checkingAcc.deposit(1000);
       checkingAcc.withdraw(250);

       SavingAccount savingAcc = new SavingAccount("Tom", 2, 200, 0.05);
       savingAcc.monthlyMaintenance();
       savingAcc.deposit(100);
       
       System.out.println("Transaction history:" + checkingAcc.getTransactionHistory());
       System.out.println("Transaction history:" + savingAcc.getTransactionHistory());
    }
}

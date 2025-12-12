public class BankMain {

    public static void main(String[] args) {
        
        BankAccount x = new BankAccount(1001, "Sadat " , 1000);
        BankAccount y = new BankAccount(1002, "Gecko ", 600);
        BankAccount z = new BankAccount(1003, "Dager1 ", 700);

        x.deposit(10000);
        x.withdraw(500);
        y.deposit(300);
        y.withdraw(200);
        z.deposit(25000);
        z.withdraw(3700);
        
        System.out.println("Account 1: " + x.getAccountHolder() + "Account Number: " + x.getAccountNumber() + "Balance: " + x.getBalance());
        System.out.println("Account 2: " + y.getAccountHolder() + "Account Number: " + y.getAccountNumber() + "Balance: " + y.getBalance());
        System.out.println("Account 3: " + z.getAccountHolder() + "Account Number: " + z.getAccountNumber() + "Balance: " + z.getBalance());
        
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Total Balance: " + BankAccount.getTotalBankBalance());
    }
}
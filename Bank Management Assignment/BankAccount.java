public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    static int totalAccounts;
    static double totalBankBalance;


    public BankAccount(int accountNumber, String accountHolder , double initialBalance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

        if(initialBalance<500){
            System.out.println(" initial balance at least 500. Setting Balance to 500  ");
            this.balance = 500;
        }
        else{
            this.balance= initialBalance;
        }

        totalAccounts++;
        totalBankBalance += this.balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println(" Deposit have to be positive  ");
            return;
        }
        balance += amount;
        totalBankBalance += amount;
        System.out.println("Deposited : " + amount + " New balance : " + balance);
    }

    public void withdraw(double amount){
        if (amount<=0){
            System.out.println("Withdraw have to be positive");
            return;
        }
        if (balance - amount <500){
            System.out.println("Minimum balance have to be 500");
            return ;
        }
        balance -= amount;
        totalBankBalance -= amount;
        System.out.println("Withdrawn :" + amount + " New Balance :" + balance);
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public static double getTotalBankBalance() {
        return totalBankBalance;

    }    
    
}

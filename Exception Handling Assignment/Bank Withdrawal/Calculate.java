public class Calculate {
    public static void withdrawal(double balance,double amount) throws InsufficientBalance
    {
        if(amount<=0)
        {
            throw new ArithmeticException("Withdraw has to be bigger than 0");
        }

        if(amount>balance)
        {
            throw new InsufficientBalance("Insufficient Balance in your account");
        }

        System.out.println("Withdraw success !!");
        System.out.println("New Balance : " + (balance-amount));
    }    
}

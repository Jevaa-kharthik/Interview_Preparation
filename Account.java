public class Account {
    private String account_number;
    private double balance;

    public Account(String account_number, int initialBalance){
        this.account_number = account_number;
        if(initialBalance > 0){
            balance = initialBalance;
        }
        else{
            balance = 0;
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("The Amount " + amount + " has deposit to the account number --> " + account_number);
        }
        else{
            System.out.println("Invalid Amount to Deposit");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("The Amount "+ amount +" has been withdrawed Successfully");
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

    public String getAccountNumber(){
        return account_number;
    }

    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        Account myAccount = new Account("123456789", 500);

        // Accessing the account number (allowed)
        System.out.println("Account Number: " + myAccount.getAccountNumber());

        // Accessing the balance (allowed via getter method)
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        // Depositing money (using the deposit method)
        myAccount.deposit(150);
        System.out.println("Balance after deposit: $" + myAccount.getBalance());

        // Withdrawing money (using the withdraw method)
        myAccount.withdraw(200);
        System.out.println("Balance after withdrawal: $" + myAccount.getBalance());

        // Trying to withdraw more than the balance
        myAccount.withdraw(600);
    }
}


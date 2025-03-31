class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0; 
    }

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("John Doe");
        BankAccount acc2 = new BankAccount("Jane Doe", 5000.0);

        acc1.display();
        System.out.println();
        acc2.display();
    }
}

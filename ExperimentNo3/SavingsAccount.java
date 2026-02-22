package ExperimentNo3;

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal not allowed. Minimum balance should be 100");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(500);
        s.deposit(200);
        s.withdraw(550);
        s.showBalance();
    }
}


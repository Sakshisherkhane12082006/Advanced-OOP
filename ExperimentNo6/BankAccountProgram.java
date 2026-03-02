package ExperimentNo6;

// Custom Exception for Low Balance
class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);
    }
}

// Custom Exception for Negative Number
class NegativeNumberException extends Exception {
    NegativeNumberException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {

    double balance = 1000;   // initial balance

    void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit negative amount!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount!");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

// Main Class
public class BankAccountProgram {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        try {
            acc.balanceEnquiry();
            acc.deposit(500);
            acc.withdraw(2000);   // Low balance exception
        } 
        catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        acc.balanceEnquiry();
    }
}

 class bankaccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

     bankaccount(String accountNumber, String accountHolderName, double balance) {
        if (balance < 0) {
            System.out.println("Balance can't be negative");
            this.balance = 0; 
        } else {
            this.balance = balance;
        }
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

     String getAccountNumber() {
        return accountNumber;
    }

     void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

     String getAccountHolderName() {
        return accountHolderName;
    }

     void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

     double getBalance() {
        return balance;
    }

     void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance can't be negative");
        } else {
            this.balance = balance;
        }
    }

   void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative");
        } else {
            setBalance(getBalance() + amount);
        }
    }

 void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount cannot be negative");
        } else if (amount > getBalance()) {
            System.out.println("Insufficient funds");
        } else {
            setBalance(getBalance() - amount);
        }
    }
}
public class Main {
    public static void main(String[] args) {
      
        bankaccount account = new bankaccount("XXX567", "Sudhi", 1000.0);

       
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

       
        account.withdraw(1500.0);
    }
}


/* 61. TASK 2 - BANK ACCOUNT
-------------------------
Required filename: BankAccount.java
Create an Account model class and a public BankAccount driver.
Account requirements:
- private String accountNumber
- private String ownerName
- private double balance
- constructor with account number and owner; initial balance is zero
- overloaded constructor accepting a valid non-negative opening balance
- boolean deposit(double amount)
- boolean withdraw(double amount)
- getters, but no public setBalance()
- String toString()
Test positive, zero, and negative deposits; valid and excessive withdrawals;
and two independent Account objects.
*/
public class BankAccount {
    class Account {
        private String accountNumber;
        private String ownerName;
        private double balance;
        public Account(String accountNumber, String ownerName) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.balance = 0;
        }
        public Account(String accountNumber, String ownerName, double openingBalance) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            if (openingBalance < 0) {
                System.out.println("Opening balance cannot be negative");
                this.balance = 0;
            } else {
                this.balance = openingBalance;
            }
        }
        public boolean deposit(double amount) {
            if (amount <= 0) {
                return false;
            }
            balance = balance + amount;
            return true;
        }
        public boolean withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                return false;
            }
            balance = balance - amount;
            return true;
        }
        public String getAccountNumber() {
            return accountNumber;
        }
        public String getOwnerName() {
            return ownerName;
        }
        public double getBalance() {
            return balance;
        }
        public void printAccount() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Balance: " + balance);
        }
    }
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        Account a1 = bank.new Account("A101", "Bhavika");
        System.out.println("Deposit 1000: " + a1.deposit(1000));
        System.out.println("Deposit 0: " + a1.deposit(0));
        System.out.println("Deposit -500: " + a1.deposit(-500));
        a1.printAccount();
        System.out.println("Withdraw 300: " + a1.withdraw(300));
        System.out.println("Withdraw 1000: " + a1.withdraw(1000));
        a1.printAccount();
        Account a2 = bank.new Account("A102", "Ananya", 5000);
        a2.printAccount();
        a2.deposit(1000);
        a2.printAccount();
        a1.printAccount();
    }
}

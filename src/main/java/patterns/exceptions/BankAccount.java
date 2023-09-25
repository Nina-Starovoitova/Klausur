package patterns.exceptions;

import patterns.exceptions.exception.InsufficientFundsException;

import java.util.Arrays;

class BankAccount extends BankProductAbstr implements AccountInt {
    private double balance;
    private Customer owner;
    private Transaction[] transactionHistory;
    private int transactionCount;

    public BankAccount(Customer owner, double initialBalance, String name, double interestRate) {
        super(name, interestRate);
        this.owner = owner;
        balance = initialBalance;
        transactionHistory = new Transaction[100];
        transactionCount = 0;
    }

    @Override
    public double calculateInterest() {

        double interest = getBalance() * getInterestRate();
        return interest;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        recordTransaction("Deposit", amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
            recordTransaction("Withdrawal", -amount);
        } else {
            throw new InsufficientFundsException("Insufficient funds to withdraw " + amount);
        }
    }

    public void recordTransaction(String description, double amount) {
        Transaction transaction = new Transaction(description, amount);
        transactionHistory[transactionCount++] = transaction;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public Transaction[] getTransactionHistory() {
        return Arrays.copyOf(transactionHistory, transactionCount);
    }

    public Customer getOwner() {
        return owner;
    }
}

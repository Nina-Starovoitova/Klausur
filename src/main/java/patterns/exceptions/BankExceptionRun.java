package patterns.exceptions;

import patterns.exceptions.exception.InsufficientFundsException;

public class BankExceptionRun {
    public static void main(String[] args) {
        Bank myBank = new Bank(3);

        // Perform some operations
        try {
            myBank.getAccounts()[0].deposit(500.0);
            myBank.getAccounts()[1].withdraw(200.0);
            myBank.getAccounts()[2].withdraw(1500.0); // This will throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Print the total balance and transaction history for an account
        System.out.println("Total Balance in the Bank: $" + myBank.getTotalBalance());
        printTransactionHistory((BankAccount) myBank.getAccounts()[0]);
    }

    public static void printTransactionHistory(BankAccount account) {
        System.out.println("Transaction History for " + account.getOwner().getName() + ":");
        for (int i = 0; i < account.getTransactionCount(); i++) {
            Transaction transaction = account.getTransactionHistory()[i];
            System.out.println(
                    "[" + transaction.getDescription() + "] Amount: $" + transaction.getAmount()
            );
        }
    }
}

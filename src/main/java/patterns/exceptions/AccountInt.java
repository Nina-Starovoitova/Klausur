package patterns.exceptions;

import patterns.exceptions.exception.InsufficientFundsException;

interface AccountInt {
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount) throws InsufficientFundsException;
}

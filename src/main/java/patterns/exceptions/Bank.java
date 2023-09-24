package patterns.exceptions;

// Bank class managing multiple bank accounts
class Bank {
    private AccountInt[] accounts;

    public Bank(int numAccounts) {
        accounts = new AccountInt[numAccounts];
        for (int i = 0; i < numAccounts; i++) {
            Customer customer = new Customer("Customer " + (i + 1));
            accounts[i] = new BankAccount(customer, 1000.0, "Savings AccountInt", 0.02);
        }
    }

    public AccountInt[] getAccounts() {
        return accounts;
    }

    public double getTotalBalance() {
        double total = 0;
        for (AccountInt account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}

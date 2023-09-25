package patterns.exceptions;


abstract class BankProductAbstr {
    private String name;
    private double interestRate;

    public BankProductAbstr(String name, double interestRate) {
        this.name = name;
        this.interestRate = interestRate;
    }

    public String getName() {
        return name;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public abstract double calculateInterest();
}

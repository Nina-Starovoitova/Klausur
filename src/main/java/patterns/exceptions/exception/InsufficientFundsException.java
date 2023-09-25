package patterns.exceptions.exception;

// Custom exception class
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

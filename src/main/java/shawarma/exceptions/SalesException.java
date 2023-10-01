package shawarma.exceptions;

// Исключение, представляющее ошибку при продаже шаурмы
public class SalesException extends Exception {
    public SalesException(String message) {
        super(message);
    }
}



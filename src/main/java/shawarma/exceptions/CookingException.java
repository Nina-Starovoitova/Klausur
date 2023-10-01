package shawarma.exceptions;

// Исключение, представляющее ошибку при готовке шаурмы
public class CookingException extends Exception {
    public CookingException(String message) {
        super(message);
    }
}

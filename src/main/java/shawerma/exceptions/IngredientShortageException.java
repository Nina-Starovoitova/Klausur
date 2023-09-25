package shawerma.exceptions;

// Исключение, представляющее нехватку ингредиентов для шаурмы
public class IngredientShortageException extends Exception {
    public IngredientShortageException(String message) {
        super(message);
    }
}

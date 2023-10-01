package shawarma;
import shawarma.exceptions.SalesException;
import java.util.Random;

// Класс, представляющий продавца шаурмы
class ShawarmaVendor {
    public void sellShawarma() throws SalesException {
        // Продажа шаурмы...
        if (new Random().nextBoolean()) {
            throw new SalesException("Ошибка при продаже шаурмы: не удается выдать заказ!");
        }
    }
}
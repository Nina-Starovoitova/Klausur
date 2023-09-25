package shawerma;

import shawerma.exceptions.CookingException;
import shawerma.exceptions.SalesException;

// Класс, представляющий покупателя шаурмы
class Customer {
    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator(2, 3);
        ShawarmaChef chef = new ShawarmaChef();
        ShawarmaVendor vendor = new ShawarmaVendor();
        try {
            chef.cookShawarma(fridge);
            vendor.sellShawarma();
            System.out.println("Шаурма успешно куплена и съедена!");
        } catch (CookingException | SalesException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
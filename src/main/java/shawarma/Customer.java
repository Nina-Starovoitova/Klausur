package shawarma;

import shawarma.exceptions.CookingException;
import shawarma.exceptions.SalesException;
import java.util.Random;

// Класс, представляющий покупателя шаурмы
class Customer {
    public static void  main(String[] args) {
        Random rand = new Random();
        int initialChicken  = rand.nextInt(10)  ;
        int initialVeggies = rand.nextInt(10);
        System.out.println("Курица: " + (initialChicken) + " шт. " +  " Овощи: " +  initialVeggies + " шт.");
        Refrigerator fridge = new Refrigerator( initialChicken, initialVeggies);
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
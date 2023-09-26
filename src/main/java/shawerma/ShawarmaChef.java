package shawerma;

import shawerma.exceptions.CookingException;
import shawerma.exceptions.IngredientShortageException;

import java.util.Random;

// Класс, представляющий повара шаурмы
class ShawarmaChef {
    public void cookShawarma(Refrigerator fridge) throws CookingException {
        Random rand = new Random();
        int takeChicken  = rand.nextInt(3)  ;
        int takeVeggies = rand.nextInt(3);
        try {
            // Готовим шаурму, используя ингредиенты из холодильника
            fridge.takeChicken(takeChicken);
            fridge.takeVeggies(takeVeggies);
            // Процесс приготовления...
            if (new Random().nextBoolean()) {
                throw new CookingException("Ошибка при готовке шаурмы: сгорело!");
            }
        } catch (IngredientShortageException e) {
            throw new CookingException("Ошибка при готовке шаурмы: " + e.getMessage());
        }
    }
}

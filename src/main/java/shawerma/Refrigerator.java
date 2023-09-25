package shawerma;

import shawerma.exceptions.IngredientShortageException;

// Класс, представляющий холодильник с ингредиентами
class Refrigerator {
    private int chicken;
    private int veggies;

    public Refrigerator(int initialChicken, int initialVeggies) {
        chicken = initialChicken;
        veggies = initialVeggies;
    }

    public void takeChicken(int quantity) throws IngredientShortageException {
        if (chicken >= quantity) {
            chicken -= quantity;
        } else {
            throw new IngredientShortageException("Недостаточно курицы в холодильнике!");
        }
    }

    public void takeVeggies(int quantity) throws IngredientShortageException {
        if (veggies >= quantity) {
            veggies -= quantity;
        } else {
            throw new IngredientShortageException("Недостаточно овощей в холодильнике!");
        }
    }
}


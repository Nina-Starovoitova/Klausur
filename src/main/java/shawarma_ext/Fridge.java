package shawarma_ext;

import shawarma_ext.exceptions.OutOfIngredientsException;

import java.util.*;

class Fridge {
    private Map<String, Integer> ingredientsCount;


    public Fridge() {
        this.ingredientsCount = new HashMap<>();
    }

    public boolean hasIngredient(String ingredient) {
        return this.ingredientsCount.containsKey(ingredient);
    }

    public Integer getIngredientsQuantity(String ingredient) {
        return ingredientsCount.getOrDefault(ingredient, 0);
    }

    public void addIngredient(String ingredient, Integer quantity) {
        int sumIngredients = this.ingredientsCount.getOrDefault(ingredient, 0) + quantity;
        this.ingredientsCount.put(ingredient, sumIngredients);
    }

    public boolean takeIngredient(String ingredient, int quantity) throws OutOfIngredientsException{
        if (getIngredientsQuantity(ingredient) >= quantity) {
            int remaining = getIngredientsQuantity(ingredient) - quantity;
            this.ingredientsCount.put(ingredient, remaining);
            return true;
        }

        throw new OutOfIngredientsException("shortage of products");
    }
}

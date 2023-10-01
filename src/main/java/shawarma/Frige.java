package shawarma;

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
        this.ingredientsCount.put(ingredient, quantity);
    }
    public takeIngredient(String ingredient, int quantity){

    }
}

package shawarma_ext;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FridgeTest {

    private Fridge fridge;

    @BeforeEach
    void setUp() {
        this.fridge = new Fridge();
    }

    @Test
    void hasIngredient() {
        // 1 v holod net tov
        //2 v holod est tov

        String ingredient = "Tomato";
        int qty = 12;
        assertFalse(this.fridge.hasIngredient(ingredient));
        this.fridge.addIngredient(ingredient, qty);
        assertTrue(this.fridge.hasIngredient(ingredient));
    }

    @Test
    void getIngredientsQuantity() {
        // poluchit kol-vo ingridientov dobavlenuch v holodilnik
        String ingredient = "Tomato";
        int qty = 20;
        this.fridge.addIngredient(ingredient, qty);
        assertEquals(qty, this.fridge.ingredientQuantity(ingredient));
    }

    @Test
    void testAddIngredient() {
        // 2 v holodilnike est yabloki i nam nuzno dobavit novue yabloki
        // 1 holodilnik pust i mu zapolnyaem ego yablokami
        String ingredient = "Apple";
        int qty = 10;
        assertFalse(this.fridge.hasIngredient(ingredient));
        this.fridge.addIngredient(ingredient, 10);
        assertEquals(this.fridge.ingredientQuantity(ingredient), qty);
        assertTrue(this.fridge.hasIngredient(ingredient));
        this.fridge.addIngredient(ingredient, qty);
        assertEquals(20, this.fridge.getIngredientsQuantity(ingredient));

    }

    @Test
    void takeIngredient() {
        // 2 esli kolichesto produkta bolsche ili ravno chem v zaprose, to mu mozhem otdat ego.
        //3  esly zapraschuvaet bolsche ili chem est v holodilnike,nevozmozhno vupolnit.
        //1 esly net dannogo tipa produkta v holod.

        String ingredient = "Apple";
        int qty = 10;
        assertFalse(this.fridge.takeIngredient(ingredient, qty));
        this.fridge.addIngredient(ingredient, 15);
        assertFalse(this.fridge.takeIngredient(ingredient, qty + qty));
        assertTrue(this.fridge.takeIngredient(ingredient, 15));
        assertEquals(0, this.fridge.getIngredientsQuantity(ingredient));
        this.fridge.addIngredient(ingredient, 30);
        this.fridge.takeIngredient(ingredient, 15);
        assertEquals(15, this.fridge.getIngredientsQuantity(ingredient));

    }
}
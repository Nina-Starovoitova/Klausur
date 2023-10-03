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
    }

    @Test
    void getIngredientsQuantity() {
    }

    @Test
    void testAddIngredient() {
        // 2 v holodilnike est yabloki i nam nuzno dobavit novue yabloki
        // 1 holodilnik pust i mu zapolnyaem ego yablokami
        String ingredient = "Apple";
        int qty = 10;
        assertFalse( this.fridge.hasIngredient(ingredient));
        this.fridge.addIngredient(ingredient,10);
        assertEquals(this.fridge.ingredientQuantity(ingredient), qty);
        assertTrue(this.fridge.hasIngredient(ingredient));
        this.fridge.addIngredient(ingredient,qty);
        assertEquals(20, this.fridge.getIngredientsQuantity(ingredient));

    }

    @Test
    void takeIngredient() {
    }
}
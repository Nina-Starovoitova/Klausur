package shawarma_ext;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<ShawarmaInt> items;

    public List<ShawarmaInt> getItems() {
        return items;

    }

    public void addItem (ShawarmaInt item) {
        this.items.add(item);

    }

    public Menu() {
        this.items = new ArrayList<>();

    }
}

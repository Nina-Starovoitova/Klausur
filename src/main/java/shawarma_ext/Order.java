package shawarma_ext;

import java.util.ArrayList;
import java.util.List;

public class Order  {
    List<ShawarmaInt> items;

    public Order() {
        items = new ArrayList<>();

    }
    public void addItems(ShawarmaInt schawarma){
        this.items.add(schawarma);
    }
    public double calculateTotalPrice(){
        double sum = 0;
        for(ShawarmaInt shawarma: items){
             sum += shawarma.getPrice();
        }
        return sum;
    }

    public List<ShawarmaInt> getItems() {
        return items;
    }
}

package probs;

import java.util.List;
import java.util.Set;

public class MainHouse {
    private Set<Haus> houses;
    private final MainHouse mainHouse = new MainHouse();
    public void addHouse(Haus haus) {
        houses.add(haus);
    }

    public int getTotalDoors(){
        int totalDoors=0;
        for (Haus haus : houses){
           totalDoors += haus.getDoors().getDoors();
        }
        return totalDoors;
    }
}

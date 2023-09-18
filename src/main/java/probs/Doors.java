package probs;

public class Doors implements HouseInter{
    private int doors;
    public static int woodDoors;


    public int getDoors() {
        return woodDoors;
        //return this.doors;
    }

    public void setDoors(int doors) {
        this.doors =doors;
        woodDoors = doors;
    }

    private Doors() {

    }

    public Doors(int doors) {
        woodDoors = doors;
        this.doors = doors;
    }
}

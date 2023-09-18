package probs;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Haus {
    private Windows windows;
    private Doors doors;
    private Walls walls;
    private Floor floor;
    private Ceilling ceilling;
    private SwimmingPool swimmingPool;

    public Haus(Windows windows, Doors doors, Walls walls, Floor floor, Ceilling ceilling, SwimmingPool swimmingPool) {

        this.windows = windows;
        this.doors = doors;
        this.walls = walls;
        this.floor = floor;
        this.ceilling = ceilling;
        this.swimmingPool = swimmingPool;
        ArrayList<Object> list = new ArrayList<>();
        list.add(doors);
        list.remove(doors);

        Doors yt = new Doors(4567);

        yt.getDoors();



    }

    public Haus(Doors doors, Windows windows, Walls walls, Floor floor, Ceilling ceilling, SwimmingPool swimmingPool) {

        this.windows = windows;
        this.doors = doors;
        this.walls = walls;
        this.floor = floor;
        this.ceilling = ceilling;
        this.swimmingPool = swimmingPool;
    }

    public Haus(Windows windows, Doors doors, Walls walls, Floor floor, Ceilling ceilling) {

        this.windows = windows;
        this.doors = doors;
        this.walls = walls;
        this.floor = floor;
        this.ceilling = ceilling;

    }

    public void buildHaus() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        Windows windows1 = new Windows(4);
        Doors doors1 = new Doors(6);
        Walls walls1 = new Walls(7);
        Floor floor1 = new Floor(2);
        Ceilling ceilling1 = new Ceilling(2);
        Haus haus = new Haus(windows1, doors1, walls1, floor1, ceilling1);
        haus.setCeilling(ceilling1);

        Doors doors2 = new Doors(4567);
        Doors doors3 = new Doors(325);
        System.out.println(doors2.getDoors());
        doors2.setDoors(90);
        doors3.setDoors(543);
        System.out.println(doors2.getDoors());

    }
    public Integer countDoors ()
    {

       return null;
    }
}

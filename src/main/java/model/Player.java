package model;

import java.util.ArrayList;

public class Player {
    //kamle nashode
    String name;
    ArrayList<Unit> units=new ArrayList<>();

    public Player(String name){
        this.name=name;
    }

    public void setUnits(Unit unit) {
        units.add(unit);
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void removeUnit(Unit unit){
        units.remove(unit);
    }
}

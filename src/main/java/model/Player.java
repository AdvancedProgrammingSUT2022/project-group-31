package model;

import java.util.ArrayList;

public class Player {
    //TODO kamle nashode
    User user;
    String name;
    ArrayList<Unit> units = new ArrayList<>();

    public Player(String name, User user) {
        this.name = name;
        this.user = user;
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

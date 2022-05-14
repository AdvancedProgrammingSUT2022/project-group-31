package model;

import java.util.ArrayList;

public class Player {
    //TODO kamle nashode
    User user;
    String name;
    ArrayList<Unit> units = new ArrayList<>();
    ArrayList<Hex> visibleHexes = new ArrayList<>();

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

    public boolean isHexVisible(Hex hex) {
        if (visibleHexes.contains(hex)) return true;
        return false;
    }

    public void addVisibleHex(Hex hex) {
        visibleHexes.add(hex);
    }


    public void removeUnit(Unit unit) {
        units.remove(unit);
    }

    @Override
    public String toString() {
        return user.getNickname();
    }
}

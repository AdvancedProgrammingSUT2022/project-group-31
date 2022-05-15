package model;

import Enums.Types.LuxuryResources;

import java.util.ArrayList;

public class Player {
    //TODO kamle nashode
    User user;
    String name;
    ArrayList<Unit> units = new ArrayList<>();
    ArrayList<Hex> visibleHexes = new ArrayList<>();
    ArrayList<LuxuryResources> achievedLuxuryResources = new ArrayList<>();


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

    public boolean isLuxuryResourceFirstAchievement(LuxuryResources luxuryResources) {
        if (achievedLuxuryResources.contains(luxuryResources))
            return false;

        return true;
    }

    public void addLuxuryResource(LuxuryResources luxuryResources) {
        achievedLuxuryResources.add(luxuryResources);
    }
}

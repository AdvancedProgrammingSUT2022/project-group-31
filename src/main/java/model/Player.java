package model;

import Enums.Types.LuxuryResources;
import Enums.Types.Technology;

import java.util.ArrayList;

public class Player {
    //TODO kamle nashode
    User user;
    String name;
    private int gold = 0;
    ArrayList<Unit> units = new ArrayList<>();
    ArrayList<Hex> visibleHexes = new ArrayList<>();
    ArrayList<LuxuryResources> achievedLuxuryResources = new ArrayList<>();
    ArrayList<City> cities = new ArrayList<>();
    private ArrayList<Technology> achievedTechnologies = new ArrayList<>();


    public Player(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public void setCity(City city) {
        cities.add(city);
    }

    public void setUnits(Unit unit) {
        units.add(unit);
    }

    public ArrayList<Unit> getAllUnits() {
        return units;
    }

    public boolean isHexVisible(Hex hex) {
        if (visibleHexes.contains(hex)) return true;
        return false;
    }

    public ArrayList<Technology> getAchievedTechnologies() {
        return achievedTechnologies;
    }

    public void addVisibleHex(Hex hex) {
        visibleHexes.add(hex);
    }


    public ArrayList<City> getCities() {
        return cities;
    }

    public void removeUnit(Unit unit) {
        units.remove(unit);
    }

    @Override
    public String toString() {
        return user.getNickname();
    }

    public boolean isLuxuryResourceFirstAchievement(LuxuryResources luxuryResources) {
        if (achievedLuxuryResources.contains(luxuryResources)) return false;

        return true;
    }

    public void addTechnology(Technology technology) {
        achievedTechnologies.add(technology);
    }

    public void addLuxuryResource(LuxuryResources luxuryResources) {
        achievedLuxuryResources.add(luxuryResources);
    }

    public boolean isTechnologyAchieved(Technology technology) {
        if (achievedTechnologies.contains(technology)) return true;
        return false;

    }
}

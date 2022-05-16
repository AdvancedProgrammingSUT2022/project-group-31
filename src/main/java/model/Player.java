package model;

import Enums.Types.LuxuryResources;
import Enums.Types.Technology;

import java.util.ArrayList;

public class Player {


    //TODO kamle nashode
    private User user;
    private String name;
    private int gold = 0;
    private ArrayList<MilitaryUnitt> units = new ArrayList<>();
    private ArrayList<Hex> visibleHexes = new ArrayList<>();
    private ArrayList<LuxuryResources> achievedLuxuryResources = new ArrayList<>();
    private ArrayList<City> cities = new ArrayList<>();
    private ArrayList<Technology> achievedTechnologies = new ArrayList<>();


    public Player(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setUnits(ArrayList<MilitaryUnitt> units) {
        this.units = units;
    }

    public ArrayList<Hex> getVisibleHexes() {
        return visibleHexes;
    }

    public void setVisibleHexes(ArrayList<Hex> visibleHexes) {
        this.visibleHexes = visibleHexes;
    }

    public ArrayList<LuxuryResources> getAchievedLuxuryResources() {
        return achievedLuxuryResources;
    }

    public void setAchievedLuxuryResources(ArrayList<LuxuryResources> achievedLuxuryResources) {
        this.achievedLuxuryResources = achievedLuxuryResources;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public void setAchievedTechnologies(ArrayList<Technology> achievedTechnologies) {
        this.achievedTechnologies = achievedTechnologies;
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public void addUnit(MilitaryUnitt unit) {
        units.add(unit);
    }

    public ArrayList<MilitaryUnitt> getUnits() {
        return units;
    }

    public ArrayList<MilitaryUnitt> getAllUnits() {
        return units;
    }


    public ArrayList<City> getCities() {
        return cities;
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


    public void removeUnit(MilitaryUnitt unit) {
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

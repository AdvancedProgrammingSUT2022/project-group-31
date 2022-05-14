package model;

import java.util.ArrayList;

public class Player {
    //TODO kamle nashode
    User user;
    String name;
    ArrayList<Unit> units =new ArrayList<>();
    ArrayList<City> cities=new ArrayList<>();

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

    public ArrayList<Unit> getUnit() {
        return units;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void removeUnit(Unit unit){
        units.remove(unit);
    }
}

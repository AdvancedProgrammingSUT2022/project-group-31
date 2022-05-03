package model;

import Enums.Types.ImprovementTypes;

public class Hex {
    private String color;
    private String typeName;
    private int MP;
    private int food;
    private int gold;
    private int production;
    private double battleEfficiency;
    private boolean isRiverOnNorth;
    private boolean isRiverOnSouth;
    private boolean isRiverOnNorthWest;
    private boolean isRiverOnNorthEast;
    private boolean isRiverOnNorthSouthEast;
    private boolean isRiverOnNorthSouthWest;
    private boolean hasRoad = false;
    private UnMilitaryUnit unMilitaryUnit = null;
    private MilitaryUnit militaryUnit = null;
    private Improvement improvement = null;
    private User owner = null;

    public Hex(String typeName, int food, int production, int gold, double battleEfficiency, int MP, String color) {
        this.typeName = typeName;

        this.food = food;
        this.production = production;
        this.gold = gold;
        this.battleEfficiency = battleEfficiency;
        this.MP = MP;
        this.color = color;

    }

    //public Hex (HexTypes hexType,User user  )


    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setBattleEfficiency(double battleEfficiency) {
        this.battleEfficiency = battleEfficiency;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRiverOnNorth(boolean riverOnNorth) {
        isRiverOnNorth = riverOnNorth;
    }

    public void setRiverOnSouth(boolean riverOnSouth) {
        isRiverOnSouth = riverOnSouth;
    }

    public void setRiverOnNorthWest(boolean riverOnNorthWest) {
        isRiverOnNorthWest = riverOnNorthWest;
    }

    public void setRiverOnNorthEast(boolean riverOnNorthEast) {
        isRiverOnNorthEast = riverOnNorthEast;
    }

    public void setRiverOnNorthSouthEast(boolean riverOnNorthSouthEast) {
        isRiverOnNorthSouthEast = riverOnNorthSouthEast;
    }

    public void setRiverOnNorthSouthWest(boolean riverOnNorthSouthWest) {
        isRiverOnNorthSouthWest = riverOnNorthSouthWest;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getFood() {
        return food;
    }

    public int getProduction() {
        return production;
    }

    public int getGold() {
        return gold;
    }

    public double getBattleEfficiency() {
        return battleEfficiency;
    }

    public int getMP() {
        return MP;
    }

    public String getColor() {
        return color;
    }

    public boolean isRiverOnNorth() {
        return isRiverOnNorth;
    }

    public boolean isRiverOnSouth() {
        return isRiverOnSouth;
    }

    public boolean isRiverOnNorthWest() {
        return isRiverOnNorthWest;
    }

    public boolean isRiverOnNorthEast() {
        return isRiverOnNorthEast;
    }

    public boolean isRiverOnNorthSouthEast() {
        return isRiverOnNorthSouthEast;
    }

    public boolean isRiverOnNorthSouthWest() {
        return isRiverOnNorthSouthWest;
    }

    public void setHasRoad(boolean hasRoad) {
        this.hasRoad = hasRoad;
    }

    public void setUnMilitaryUnit(UnMilitaryUnit unMilitaryUnit) {
        this.unMilitaryUnit = unMilitaryUnit;
    }

    public void setMilitaryUnit(MilitaryUnit militaryUnit) {
        this.militaryUnit = militaryUnit;
    }

    public void setImprovement(Improvement improvement) {
        this.improvement = improvement;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean isHasRoad() {
        return hasRoad;
    }

    public UnMilitaryUnit getUnMilitaryUnit() {
        return unMilitaryUnit;
    }

    public MilitaryUnit getMilitaryUnit() {
        return militaryUnit;
    }

    public Improvement getImprovement() {
        return improvement;
    }

    public User getOwner() {
        return owner;
    }
}

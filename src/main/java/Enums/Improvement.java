package Enums;

public enum Improvement {
    CAMP(0, 0, 0, Technology.TRAPPING),
    FARM(1, 0, 0, Technology.AGRICULTURE),
    LUMBER_MILL(0, 1, 0, Technology.CONSTRUCTION),
    MINE(0,1,0,Technology.MINING);


    private int food;
    private int production;
    private int gold;
    private Technology neededTechnology;

    public int getFood() {
        return food;
    }

    public int getProduction() {
        return production;
    }

    public int getGold() {
        return gold;
    }

    public Technology getNeededTechnology() {
        return neededTechnology;
    }

    Improvement(int food, int production, int gold, Technology neededTechnology) {
        this.food = food;
        this.production = production;
        this.gold = gold;
        this.neededTechnology = neededTechnology;
    }
}

package Enums.Types;

import Enums.Types.Improvement;

public enum BonusResources {
    BANANA(1, 0, 0, Improvement.FARMING),
    COW(1, 0, 0, Improvement.PASTURE),
    GAZELLE(1, 0, 0, Improvement.CAMP),
    SHEEP(2, 0, 0, Improvement.PASTURE),
    WHEAT(1, 0, 0, Improvement.FARM);

    BonusResources(int food, int production, int gold, Improvement neededImprovement) {
        this.food = food;
        this.gold = gold;
        this.neededImprovement = neededImprovement;
        this.production = production;
    }

    private final int food;
    private final int production;
    private final int gold;
    private final Improvement neededImprovement;

    public int getFood() {
        return food;
    }

    public int getProduction() {
        return production;
    }

    public int getGold() {
        return gold;
    }

    public Improvement getNeededImprovement() {
        return neededImprovement;
    }
}

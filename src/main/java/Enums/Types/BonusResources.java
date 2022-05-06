package Enums.Types;

public enum BonusResources {
    BANANA(1, 0, 0, ImprovementTypes.FARMING),
    COW(1, 0, 0, ImprovementTypes.PASTURE),
    GAZELLE(1, 0, 0, ImprovementTypes.CAMP),
    SHEEP(2, 0, 0, ImprovementTypes.PASTURE),
    WHEAT(1, 0, 0, ImprovementTypes.FARM);

    BonusResources(int food, int production, int gold, ImprovementTypes neededImprovement) {
        this.food = food;
        this.gold = gold;
        this.neededImprovement = neededImprovement;
        this.production = production;
    }

    private final int food;
    private final int production;
    private final int gold;
    private final ImprovementTypes neededImprovement;

    public int getFood() {
        return food;
    }

    public int getProduction() {
        return production;
    }

    public int getGold() {
        return gold;
    }

    public ImprovementTypes getNeededImprovement() {
        return neededImprovement;
    }
}

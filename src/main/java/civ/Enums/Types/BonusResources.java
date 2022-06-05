package civ.Enums.Types;

public enum BonusResources {
    BANANA("Banana", 1, 0, 0, ImprovementTypes.FARMING),
    COW("Cow", 1, 0, 0, ImprovementTypes.PASTURE),
    GAZELLE("Gazelle", 1, 0, 0, ImprovementTypes.CAMP),
    SHEEP("Sheep", 2, 0, 0, ImprovementTypes.PASTURE),
    WHEAT("Wheat", 1, 0, 0, ImprovementTypes.FARM);


    BonusResources(String name, int food, int production, int gold, ImprovementTypes neededImprovement) {
        this.name = name;
        this.food = food;
        this.gold = gold;
        this.neededImprovement = neededImprovement;
        this.production = production;
    }

    private final int food;
    private final int production;
    private final int gold;
    private final String name;
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

package Enums.Types;

public enum LuxuryResources {
    COTTON("Cotton", 0, 0, 2, ImprovementTypes.FARMING),
    COLOR("Color", 0, 0, 2, ImprovementTypes.FARMING),
    FUR("Fur", 0, 0, 2, ImprovementTypes.FARMING),
    GEMSTONE("GemStone", 0, 0, 3, ImprovementTypes.MINE),
    GOLD("Gold", 0, 0, 2, ImprovementTypes.MINE),
    FUMIGATION("Fumigation", 0, 0, 2, ImprovementTypes.FARMING),
    TUSK("Tusk", 0, 0, 2, ImprovementTypes.CAMP),
    MARBLE("Marble", 0, 0, 2, ImprovementTypes.STONE_MINE),
    SILK("Silk", 0, 0, 2, ImprovementTypes.FARMING),
    SUGAR("Sugar", 0, 0, 2, ImprovementTypes.FARMING);

    LuxuryResources(String name, int food, int production, int gold, ImprovementTypes neededImprovement) {
        this.name = name;
        this.food = food;
        this.gold = gold;
        this.neededImprovement = neededImprovement;
        this.production = production;
        firstFind = true;
    }

    private final int food;
    private final int production;
    private final int gold;
    private final String name;
    private final boolean firstFind;
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

    public boolean isFirstFind() {
        return firstFind;
    }


    @Override
    public String toString() {
        return name ;
    }
}

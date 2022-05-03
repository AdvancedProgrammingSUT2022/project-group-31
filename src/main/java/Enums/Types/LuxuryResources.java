package Enums.Types;

public enum LuxuryResources {
    COTTON(0,0,2, ImprovementTypes.FARMING),
    COLOR(0,0,2, ImprovementTypes.FARMING),
    FUR(0,0,2, ImprovementTypes.FARMING),
    GEMSTONE(0,0,3, ImprovementTypes.MINE),
    GOLD (0,0,2, ImprovementTypes.MINE),
    FUMIGATION(0,0,2, ImprovementTypes.FARMING),
    TUSK(0,0,2, ImprovementTypes.CAMP),
    MARBLE(0,0,2, ImprovementTypes.STONE_MINE),
    SILK(0,0,2, ImprovementTypes.FARMING),
    SUGAR(0,0,2, ImprovementTypes.FARMING);
    //TODO WHERE TO FIND THEM
LuxuryResources(int food, int production , int gold, ImprovementTypes neededImprovement)
{
    this.food = food;
    this.gold = gold;
    this.neededImprovement = neededImprovement;
    this.production= production;
    firstFind = true;
}
    private final int food;
    private final int production;
    private final int gold;
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

}

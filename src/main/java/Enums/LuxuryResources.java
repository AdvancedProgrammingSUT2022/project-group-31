package Enums;

public enum LuxuryResources {
    COTTON(0,0,2,Improvement.FARMING),
    COLOR(0,0,2,Improvement.FARMING),
    FUR(0,0,2,Improvement.FARMING),
    GEMSTONE(0,0,3,Improvement.MINE),
    GOLD (0,0,2,Improvement.MINE),
    FUMIGATION(0,0,2,Improvement.FARMING),
    TUSK(0,0,2,Improvement.CAMP),
    MARBLE(0,0,2,Improvement.STONE_MINE),
    SILK(0,0,2,Improvement.FARMING),
    SUGAR(0,0,2,Improvement.FARMING);
    //TODO WHERE TO FIND THEM
LuxuryResources(int food, int production , int gold, Improvement neededImprovement)
{
    this.food = food;
    this.gold = gold;
    this.neededImprovement = neededImprovement;
    this.production= production;
    firstFind = true;
}
    private int food;
    private int production;
    private int gold;
    private  boolean firstFind;
    private Improvement neededImprovement;

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

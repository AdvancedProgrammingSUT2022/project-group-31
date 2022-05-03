package Enums.Types;

public enum StrategicResources {
    COAL(0, 1, 0, Technology.MINING, ImprovementTypes.MINE),
    HORSE(0, 1, 0, Technology.ANIMAL_HUSBANDRY, ImprovementTypes.PASTURE),
    IRON(0, 1, 0, Technology.METALLURGY, ImprovementTypes.MINE);

    StrategicResources(int food, int production, int gold, Technology neededTechnology, ImprovementTypes neededImprovement) {
        this.food = food;
        this.production = production;
        this.gold = gold;
        this.neededTechnology = neededTechnology;
        this.neededImprovement = neededImprovement;
    }

    private final int food;
    private final int production;
    private final int gold;
    private final Technology neededTechnology;
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

    public Technology getNeededTechnology() {
        return neededTechnology;
    }

    public ImprovementTypes getNeededImprovement() {
        return neededImprovement;
    }
}

package Enums.Types;

public enum StrategicResources {
    COAL("Coal", 0, 1, 0, Technology.MINING, ImprovementTypes.MINE),
    HORSE("Horse", 0, 1, 0, Technology.ANIMAL_HUSBANDRY, ImprovementTypes.PASTURE),
    IRON("Iron", 0, 1, 0, Technology.METALLURGY, ImprovementTypes.MINE);

    StrategicResources(String name, int food, int production, int gold, Technology neededTechnology, ImprovementTypes neededImprovement) {
        this.name = name;
        this.food = food;
        this.production = production;
        this.gold = gold;
        this.neededTechnology = neededTechnology;
        this.neededImprovement = neededImprovement;
    }

    private final int food;
    private final int production;
    private final int gold;
    private final String name;
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

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }
}

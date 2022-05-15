package Enums.Types;

public enum LandFeatureType {
    VALLEY("Valley", 2, 0, 0, -0.33, 1),
    JUNGLE("Jungle", 1, 1, 0, 0.25, 2),
    MASSIVE_FOREST("Massive Forest", 1, -1, 0, 0.25, 2),
    LAGOON("Lagoon", -1, 0, 0, -0.33, 2),
    OASIS("Oasis", 3, 0, 1, -0.33, 1);


    private final int food;
    private final int production;
    private final int gold;
    private final double battleEfficacy;
    private final int MP;
    private final String name;

    LandFeatureType(String name, int food, int production, int gold, double battleEfficacy, int MP) {
        this.name = name;
        this.food = food;
        this.production = production;
        this.gold = gold;
        this.battleEfficacy = battleEfficacy;
        this.MP = MP;


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

    public String getName() {
        return name;
    }

    public double getBattleEfficacy() {
        return battleEfficacy;
    }

    public int getMP() {
        return MP;
    }

}

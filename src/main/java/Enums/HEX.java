package Enums;

public enum HEX {
    DESERT(0, 0, 0, -0.33, 1,new LandFeature[] {LandFeature.OASIS}),
    MEADOW(2, 0, 0, -0.33, 1,new LandFeature[]{ LandFeature.VALLEY,LandFeature.JUNGLE,LandFeature.MASSIVE_FOREST,LandFeature.LAGOON}),
    HILL(0, 2, 0, +0.25, 2,new LandFeature[]{LandFeature.MASSIVE_FOREST, LandFeature.JUNGLE,LandFeature.VALLEY}),
    MOUNTAIN(0, 0, 0, 0, -1,null),
    OCEAN(0, 0, 0, 0, -1,null),
    PLAIN(1, 1, 0, -0.33, 1,new LandFeature[]{LandFeature.LAGOON,LandFeature.MASSIVE_FOREST,LandFeature.JUNGLE,LandFeature.VALLEY }),
    SNOW(0, 0, 0, -0.33, 1,new LandFeature[]{ LandFeature.ICE}),
    TUNDRA(1, 0, 0, -0.33, 1,new LandFeature[]{ LandFeature.ICE});


    private int food;
    private int production;
    private int gold;
    private double battleEfficacy;
    private int MP;
    private LandFeature[] featuresCanHave;



    HEX(int food, int production, int gold, double battleEfficacy, int MP,LandFeature[] featuresCanHave) {
        this.food = food;
        this.production = production;
        this.gold = gold;
        this.battleEfficacy = battleEfficacy;
        this.MP = MP;
        this.featuresCanHave = featuresCanHave;

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

    public double getBattleEfficacy() {
        return battleEfficacy;
    }

    public int getMP() {
        return MP;
    }

    public LandFeature[] getFeaturesCanHave() {
        return featuresCanHave;
    }
}

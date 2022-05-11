package Enums.Types;

import Enums.Colors;


public enum HexTypes {

    DESERT("DESERT", "DSR", 0, 0, 0, -0.33, 1, new LandFeatureType[]{LandFeatureType.OASIS}, Colors.BACKGROUND_MAGENTA),
    MEADOW("MEADOW", "MDW", 2, 0, 0, -0.33, 1, new LandFeatureType[]{LandFeatureType.VALLEY, LandFeatureType.JUNGLE, LandFeatureType.MASSIVE_FOREST, LandFeatureType.LAGOON}, Colors.BACKGROUND_GREEN),
    HILL("HILL", "HIL", 0, 2, 0, +0.25, 2, new LandFeatureType[]{LandFeatureType.MASSIVE_FOREST, LandFeatureType.JUNGLE, LandFeatureType.VALLEY}, Colors.BACKGROUND_YELLOW),
    MOUNTAIN("MOUNTAIN", "MNT", 0, 0, 0, 0, -1, null, Colors.BACKGROUND_RED),
    OCEAN("OCEAN", "OCN", 0, 0, 0, 0, -1, null, Colors.BACKGROUND_BLUE),
    PLAIN("PLAIN", "PLN", 1, 1, 0, -0.33, 1, new LandFeatureType[]{LandFeatureType.LAGOON, LandFeatureType.MASSIVE_FOREST, LandFeatureType.JUNGLE, LandFeatureType.VALLEY}, Colors.Background_Bright_Green),
    SNOW("SNOW", "SNW", 0, 0, 0, -0.33, 1, new LandFeatureType[]{LandFeatureType.ICE}, Colors.Background_Bright_Blue),
    TUNDRA("TUNDRA", "TUN", 1, 0, 0, -0.33, 1, new LandFeatureType[]{LandFeatureType.ICE}, Colors.Background_Bright_Cyan);

    private final String shortName;
    private final String fullName;
    private final int food;
    private final int production;
    private final int gold;
    private final double battleEfficiency;
    private final int MP;
    private final LandFeatureType[] featuresCanHave;
    private final String color;
    Colors colors = Colors.getInstance(); //TODO

    HexTypes(String fullName, String name, int food, int production, int gold, double battleEfficacy, int MP, LandFeatureType[] featuresCanHave, String color) {

        this.food = food;
        this.production = production;
        this.gold = gold;
        this.battleEfficiency = battleEfficacy;
        this.MP = MP;
        this.featuresCanHave = featuresCanHave;
        this.color = color;
        this.shortName = name;
        this.fullName = fullName;
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
        return battleEfficiency;
    }

    public int getMP() {
        return MP;
    }

    public LandFeatureType[] getFeaturesCanHave() {
        return featuresCanHave;
    }

    public String getColor() {
        return color;
    }

    public String getShortName() {
        return shortName;
    }
}

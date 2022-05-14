package Enums.Types;

import Enums.Colors;


public enum HexTypes {

    DESERT("DESERT", "DSR", 0, 0, 0, -0.33, 1, Colors.BACKGROUND_MAGENTA),
    MEADOW("MEADOW", "MDW", 2, 0, 0, -0.33, 1, Colors.BACKGROUND_GREEN),
    HILL("HILL", "HIL", 0, 2, 0, +0.25, 2, Colors.BACKGROUND_YELLOW),
    MOUNTAIN("MOUNTAIN", "MNT", 0, 0, 0, 0, -1, Colors.BACKGROUND_RED),
    OCEAN("OCEAN", "OCN", 0, 0, 0, 0, -1, Colors.BACKGROUND_BLUE),
    PLAIN("PLAIN", "PLN", 1, 1, 0, -0.33, 1, Colors.Background_Bright_Green),
    SNOW("SNOW", "SNW", 0, 0, 0, -0.33, 1, Colors.Background_Bright_Blue),
    TUNDRA("TUNDRA", "TUN", 1, 0, 0, -0.33, 1, Colors.Background_Bright_Cyan);


    private final String shortName;
    private final String fullName;
    private final int food;
    private final int production;
    private final int gold;
    private final double battleEfficiency;
    private final int MP;
    private final String color;

    public String getFullName() {
        return fullName;
    }

    public double getBattleEfficiency() {
        return battleEfficiency;
    }


    HexTypes(String fullName, String name, int food, int production, int gold, double battleEfficacy, int MP, String color) {

        this.food = food;
        this.production = production;
        this.gold = gold;
        this.battleEfficiency = battleEfficacy;
        this.MP = MP;

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

    public String getColor() {
        return color;
    }

    public String getShortName() {
        return shortName;
    }
}

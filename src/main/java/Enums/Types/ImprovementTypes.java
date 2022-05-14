package Enums.Types;

import java.util.ArrayList;
import java.util.List;

public enum ImprovementTypes {
    CAMP(0, 0, 0, Technology.TRAPPING, new ArrayList<>(List.of(LandFeatureType.JUNGLE)), new ArrayList<>(List.of(HexTypes.TUNDRA, HexTypes.HILL, HexTypes.PLAIN))),
    FARM(1, 0, 0, Technology.AGRICULTURE, new ArrayList<>(List.of()), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW))),
    LUMBER_MILL(0, 1, 0, Technology.CONSTRUCTION, new ArrayList<>(List.of(LandFeatureType.JUNGLE)), new ArrayList<>(List.of())),
    MINE(0, 1, 0, Technology.MINING, new ArrayList<>(List.of(LandFeatureType.JUNGLE, LandFeatureType.MASSIVE_FOREST, LandFeatureType.LAGOON)), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW, HexTypes.TUNDRA, HexTypes.SNOW, HexTypes.HILL))),
    PASTURE(0, 0, 0, Technology.ANIMAL_HUSBANDRY, new ArrayList<>(List.of()), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW, HexTypes.TUNDRA, HexTypes.HILL))),
    FARMING(0, 0, 0, Technology.CALENDER, new ArrayList<>(List.of(LandFeatureType.JUNGLE, LandFeatureType.MASSIVE_FOREST, LandFeatureType.LAGOON, LandFeatureType.VALLEY)), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW))),
    STONE_MINE(0, 0, 0, Technology.MASONRY, new ArrayList<>(List.of()), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW, HexTypes.TUNDRA, HexTypes.HILL))),
    TRADING_POST(0, 0, 1, Technology.TRAPPING, new ArrayList<>(List.of()), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW, HexTypes.TUNDRA))),
    FACTORY(0, 2, 0, Technology.ENGINEERING, new ArrayList<>(List.of()), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW, HexTypes.SNOW, HexTypes.TUNDRA)));


    private final int food;
    private final int production;
    private final int gold;
    private final Technology neededTechnology;
    private final ArrayList<LandFeatureType> landFeatureTypes;
    private final ArrayList<HexTypes> hexTypes;

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

    ImprovementTypes(int food, int production, int gold, Technology neededTechnology, ArrayList<LandFeatureType> landFeatureTypes, ArrayList<HexTypes> hexTypes) {
        this.food = food;
        this.production = production;
        this.gold = gold;
        this.neededTechnology = neededTechnology;
        this.hexTypes = hexTypes;
        this.landFeatureTypes = landFeatureTypes;
    }
}

package Enums.Types;

import java.util.ArrayList;
import java.util.List;

public enum ImprovementTypes {
    CAMP("Camp", 0, 0, 0, Technology.TRAPPING, new ArrayList<>(List.of(LandFeatureType.JUNGLE)), new ArrayList<>(List.of(HexTypes.TUNDRA, HexTypes.HILL, HexTypes.PLAIN))),
    FARM("Farm", 1, 0, 0, Technology.AGRICULTURE, new ArrayList<>(List.of()), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW))),
    LUMBER_MILL("Lumber Hill", 0, 1, 0, Technology.CONSTRUCTION, new ArrayList<>(List.of(LandFeatureType.JUNGLE)), new ArrayList<>(List.of())),
    MINE("Mine", 0, 1, 0, Technology.MINING, new ArrayList<>(List.of(LandFeatureType.JUNGLE, LandFeatureType.MASSIVE_FOREST, LandFeatureType.LAGOON)), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW, HexTypes.TUNDRA, HexTypes.SNOW, HexTypes.HILL))),
    PASTURE("Pasture", 0, 0, 0, Technology.ANIMAL_HUSBANDRY, new ArrayList<>(List.of()), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW, HexTypes.TUNDRA, HexTypes.HILL))),
    FARMING("Farming", 0, 0, 0, Technology.CALENDER, new ArrayList<>(List.of(LandFeatureType.JUNGLE, LandFeatureType.MASSIVE_FOREST, LandFeatureType.LAGOON, LandFeatureType.VALLEY)), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW))),
    STONE_MINE("Stone Mine", 0, 0, 0, Technology.MASONRY, new ArrayList<>(List.of()), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW, HexTypes.TUNDRA, HexTypes.HILL))),
    TRADING_POST("Trading Post", 0, 0, 1, Technology.TRAPPING, new ArrayList<>(List.of()), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW, HexTypes.TUNDRA))),
    FACTORY("Factory", 0, 2, 0, Technology.ENGINEERING, new ArrayList<>(List.of()), new ArrayList<>(List.of(HexTypes.PLAIN, HexTypes.DESERT, HexTypes.MEADOW, HexTypes.SNOW, HexTypes.TUNDRA)));

    public String getName() {
        return name;
    }

    private final String name;
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

    ImprovementTypes(String name, int food, int production, int gold, Technology neededTechnology, ArrayList<LandFeatureType> landFeatureTypes, ArrayList<HexTypes> hexTypes) {
        this.name = name;
        this.food = food;
        this.production = production;
        this.gold = gold;
        this.neededTechnology = neededTechnology;
        this.hexTypes = hexTypes;
        this.landFeatureTypes = landFeatureTypes;
    }

    public ArrayList<LandFeatureType> getLandFeatureTypes() {
        return landFeatureTypes;
    }

    public ArrayList<HexTypes> getHexTypes() {
        return hexTypes;
    }
}

package Enums;

public enum UnitsFeatures {;

    //ARCHER(70, CombatType.ARCHERY, 4, 6, 2, 2, Technology.ARCHERY, ERA.ANCIENT);


    public int getCost() {
        return cost;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public int getCombatStrength() {
        return combatStrength;
    }

    public int getRangedCombatStrength() {
        return rangedCombatStrength;
    }

    public int getRange() {
        return range;
    }

    public int getMP() {
        return MP;
    }

    public Technology getNeededTechnology() {
        return neededTechnology;
    }

    public StrategicResources getNeededResource() {
        return neededResource;
    }

    public ERA getEra() {
        return era;
    }

    private int cost;
    private CombatType combatType;
    private int combatStrength;
    private int rangedCombatStrength;
    private int range;
    private int MP;
    private Technology neededTechnology;
    private StrategicResources neededResource;
    private ERA era;

    UnitsFeatures(int cost, CombatType combatType, int combatStrength,
                  int rangedCombatStrength, int range, int MP,
                  StrategicResources neededResource, Technology neededTechnology
            , ERA era) {
        this.cost = cost;
        this.combatType = combatType;
        this.combatStrength = combatStrength;
        this.rangedCombatStrength = rangedCombatStrength;
        this.range = range;
        this.MP = MP;
        this.era = era;
        this.neededTechnology = neededTechnology;
        this.neededResource = neededResource;
    }


}

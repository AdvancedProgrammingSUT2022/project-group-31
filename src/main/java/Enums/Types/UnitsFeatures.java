package Enums.Types;

public enum UnitsFeatures {


    ARCHER(70, CombatType.ARCHERY, 4, 6, 2, 2,null, Technology.ARCHERY);

    private final int cost;
    private final CombatType combatType;
    private final int combatStrength;
    private final int rangedCombatStrength;
    private final int range;
    private final int MP;
    private final Technology neededTechnology;
    private final StrategicResources neededResource;



    UnitsFeatures(int cost, CombatType combatType, int combatStrength, int rangedCombatStrength, int range, int MP, StrategicResources neededResource, Technology neededTechnology) {
        this.cost = cost;
        this.combatType = combatType;
        this.combatStrength = combatStrength;
        this.rangedCombatStrength = rangedCombatStrength;
        this.range = range;
        this.MP = MP;
        this.neededTechnology = neededTechnology;
        this.neededResource = neededResource;
    }



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









}

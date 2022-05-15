package Enums.Types;

public enum UnitsFeatures {


    ARCHER(70, CombatType.ARCHERY, 4, 6, 2, 2, null, Technology.ARCHERY),
    CHARIOTARCHER(60, CombatType.MOUNTED, 3, 6, 2, 4, StrategicResources.HORSE, Technology.THE_WHEEL),
    SCOUT(60, CombatType.RECON, 4, 0, 0, 2, null, null),
    SETTLE(89, CombatType.CIVILIAN, 0, 0, 0, 2, null, null),
    SPEARMAN(50, CombatType.MELEE, 7, 0, 0, 2, null, Technology.BRONZE_WORKING),
    WARRIOR(40, CombatType.MELEE, 6, 0, 0, 2, null, null),
    WORKER(70, CombatType.CIVILIAN, 0, 0, 0, 2, null, null),
    CATAPULT(100, CombatType.SIEGE, 4, 14, 2, 2, StrategicResources.IRON, Technology.MATHEMATICS),
    HORSEMAN(80, CombatType.MOUNTED, 12, 0, 0, 4, StrategicResources.HORSE, Technology.HORSEBACK_RIDING),
    SWORDSMAN(80, CombatType.MELEE, 11, 0, 0, 2, StrategicResources.IRON, Technology.IRON_WORKING),
    CROSSBOWMAN(120, CombatType.ARCHERY, 6, 12, 2, 2, null, Technology.MACHINERY),
    KNIGHT(150, CombatType.MOUNTED, 18, 0, 0, 3, StrategicResources.HORSE, Technology.CHIVALRY),
    LONG_SWORDSMAN(150, CombatType.MELEE, 18, 0, 0, 3, StrategicResources.IRON, Technology.STEEL),
    PIKEMAN(100, CombatType.MELEE, 10, 0, 0, 3, null, Technology.CIVIL_SERVICE),
    TREBUCHET(170, CombatType.SIEGE, 6, 20, 2, 2, StrategicResources.IRON, Technology.PHYSICS),
    CANON(250, CombatType.SIEGE, 10, 26, 2, 2, null, Technology.CHEMISTRY),
    CAVALRY(260, CombatType.MOUNTED, 25, 0, 0, 3, StrategicResources.HORSE, Technology.MILITARY_SCIENCE),
    LANCER(220, CombatType.MOUNTED, 22, 0, 0, 4, StrategicResources.HORSE, Technology.METALLURGY),
    MUSKETMAN(120, CombatType.GUNPOWDER, 16, 0, 0, 2, null, Technology.GUNPOWDER),
    RIFLEMAN(200, CombatType.GUNPOWDER, 25, 0, 0, 2, null, Technology.RIFLING),
    ANTI_TANKGUN(300, CombatType.GUNPOWDER, 32, 0, 0, 2, null, Technology.REPLACEABLE_PARTS),
    ARTILLERY(420, CombatType.SIEGE, 16, 32, 3, 2, null, Technology.DYNAMITE),
    INFANTRY(300, CombatType.GUNPOWDER, 36, 0, 0, 2, null, Technology.REPLACEABLE_PARTS),
    PANZER(450, CombatType.ARMORED, 60, 0, 0, 5, null, Technology.COMBUSTION),
    TANK(450, CombatType.ARMORED, 50, 0, 0, 4, null, Technology.COMBUSTION),
    ;


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

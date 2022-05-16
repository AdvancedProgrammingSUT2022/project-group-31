package Enums.Types;

public enum CombatType {
    ARCHERY("ARCHERY"),
    MOUNTED("MOUNTED"),
    RECON("RECON"),
    MELEE("MELEE"),
    CIVILIAN("CIVILIAN"),
    SIEGE("SIEGE"),
    GUNPOWDER("GUNPOWDER"),
    ARMORED("ARMORED"),
    ;
    private final String name;

    CombatType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

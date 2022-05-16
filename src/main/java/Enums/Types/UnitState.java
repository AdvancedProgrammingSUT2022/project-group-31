package Enums.Types;

public enum UnitState {
    SLEEP("SLEEP"),
    WAKE("WAKE"),
    ALERT("ALERT"),
    GARRISON("GARRISON"),
    FORTIFY("FORTIFY"),
    ;
    private String name;

    UnitState(String name) {
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

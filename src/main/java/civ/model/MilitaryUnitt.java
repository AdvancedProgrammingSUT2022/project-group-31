package civ.model;

import civ.Enums.Types.UnitsFeatures;

public class MilitaryUnitt extends Unit {

    // TODO setller and worker monde...
    // TODO  extract super class...
    private UnitsFeatures unitType;
    private double HP;
    private boolean isSleep;
    private int combatStrength;

    public MilitaryUnitt(UnitsFeatures unitType, Hex position, Player owner) {
        super(position, owner);
        this.unitType = unitType;
        this.HP = 10;
        this.combatStrength = unitType.getCombatStrength();
        // owner.addUnit(this);
    }

    public UnitsFeatures getUnitType() {
        return unitType;
    }

    public Hex getPosition() {
        return position;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getHP() {
        return HP;
    }

    public void setPosition(Hex hex) {
        this.position = hex;
    }

    public void removeUnit(MilitaryUnitt removeMilitaryUnitt, Player playerHasUnit) {
        playerHasUnit.removeUnit(removeMilitaryUnitt);
    }

    public void setSleep(boolean sleep) {
        this.isSleep = sleep;
    }

    public boolean getIsSleep() {
        return isSleep;
    }

    public int getCombatStrength() {
        return combatStrength;
    }

    public void setCombatStrength(int combatStrength) {
        this.combatStrength = combatStrength;
    }

    public void buildCity(MilitaryUnitt unit, City city) {
        unit.getOwner().addCity(city);
    }

    public void setUnitType(UnitsFeatures unitType) {
        this.unitType = unitType;
    }

    public boolean isSleep() {
        return isSleep;
    }

    @Override
    public String toString() {
        // return "amoooo";
        return "Type: " + this.name + "  Combat type: " + unitType.getCombatType() + "   Position: (" + position.getX() + "," + position.getY() + ")   State: " + unitState;
    }
}

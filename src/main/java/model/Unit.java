package model;

import Enums.Types.CombatType;
import Enums.Types.UnitState;
import Enums.Types.UnitsFeatures;

public class Unit {
    protected Hex position;
    protected Player owner;
    protected UnitsFeatures unitsFeatures;
    protected int MP;
    protected String name;
    protected UnitState unitState;
    protected CombatType combatType;
    protected UnitsFeatures unitType;

    public Unit(Hex position, Player owner) {
        this.position = position;
        this.owner = owner;
        this.MP = unitsFeatures.getMP();
        this.name = unitsFeatures.getName();
        this.unitState = UnitState.WAKE;
        this.combatType = unitsFeatures.getCombatType();
    }

    public void setUnitState(UnitState unitState) {
        this.unitState = unitState;
    }

    public void setCombatType(CombatType combatType) {
        this.combatType = combatType;
    }

    public UnitState getUnitState() {
        return unitState;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public Player getOwner() {
        return owner;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getMP() {
        return MP;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

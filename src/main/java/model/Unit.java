package model;

import Enums.Types.UnitsFeatures;

public class Unit {
// TODO setller and worker monde...
    private UnitsFeatures unitType;
    private Hex positionByHex;
    private Player owner;

    public Unit(UnitsFeatures unitType, Hex positionByHex, Player owner){
        this.unitType=unitType;
        this.positionByHex=positionByHex;
        this.owner=owner;
        owner.setUnits(this);
    }

    public UnitsFeatures getUnitType() {
        return unitType;
    }

    public Hex getPositionByHex() {
        return positionByHex;
    }

    public Player getOwner() {
        return owner;
    }







}

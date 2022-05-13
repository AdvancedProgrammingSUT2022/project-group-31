package model;

import Enums.Types.UnitsFeatures;

public class Unit {
//setller and worker monde...
    private UnitsFeatures unitType;
    private Hex positionByHex;
    private Player owner;
    private double HP;
    private int MP;
    private boolean isSleep;
    private boolean isAlert;

    public Unit(UnitsFeatures unitType, Hex positionByHex, Player owner){
        this.unitType=unitType;
        this.positionByHex=positionByHex;
        this.owner=owner;
        this.HP=10;
        this.MP=unitType.getMP();

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

    public void setHP(double HP){
        this.HP=HP;
    }

    public void setMP(int MP){
        this.MP=MP;
    }

    public double getHP() {
        return HP;
    }

    public int getMP(){
        return MP;
    }

    public void setPositionByHex(Hex hex){
        this.positionByHex=hex;
    }

    public void removeUnit(Unit removeUnit, Player playerHasUnit){
        playerHasUnit.removeUnit(removeUnit);
    }








}

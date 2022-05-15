package model;

import Enums.Types.UnitsFeatures;

public class Unit {
// TODO setller and worker monde...
    private UnitsFeatures unitType;
    private Hex positionByHex;
    private Player owner;
    private double HP;
    private int MP;
    private boolean isSleep;
    private int combatStrength ;

    public Unit(UnitsFeatures unitType, Hex positionByHex, Player owner){
        this.unitType=unitType;
        this.positionByHex=positionByHex;
        this.owner=owner;
        this.HP=10;
        this.MP=unitType.getMP();
        this.combatStrength=unitType.getCombatStrength();

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

    public void setSleep(boolean sleep) {this.isSleep=sleep;}

    public boolean getIsSleep() { return isSleep;}

    public int getCombatStrength() {
        return combatStrength;
    }

    public void setCombatStrength(int combatStrength) {this.combatStrength = combatStrength;}

    public void buildCity(Unit unit,City city){
        unit.getOwner().setCity(city);
    }

}

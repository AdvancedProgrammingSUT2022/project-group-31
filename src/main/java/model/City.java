package model;

import java.util.ArrayList;

public class City {

    public City(boolean isCapital, boolean isMainCapital, int foodProduce, int productionProduce, int attackPower, int defencePower, int goldProduce) {
        this.isCapital = isCapital;
        this.isMainCapital = isMainCapital;
        this.foodProduce = foodProduce;
        this.productionProduce = productionProduce;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.goldProduce = goldProduce;
    }

    private boolean isCapital;
    private boolean isMainCapital;
    private int foodProduce;
    private int productionProduce;
    private int attackPower;
    private int defencePower;
    private int goldProduce;
    private ArrayList<Building> buildings = new ArrayList<>();


    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public void setMainCapital(boolean mainCapital) {
        isMainCapital = mainCapital;
    }

    public void setFoodProduce(int foodProduce) {
        this.foodProduce = foodProduce;
    }

    public void setProductionProduce(int productionProduce) {
        this.productionProduce = productionProduce;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setDefencePower(int defencePower) {
        this.defencePower = defencePower;
    }

    public void setGoldProduce(int goldProduce) {
        this.goldProduce = goldProduce;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public boolean isMainCapital() {
        return isMainCapital;
    }

    public int getFoodProduce() {
        return foodProduce;
    }

    public int getProductionProduce() {
        return productionProduce;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefencePower() {
        return defencePower;
    }

    public int getGoldProduce() {
        return goldProduce;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
}

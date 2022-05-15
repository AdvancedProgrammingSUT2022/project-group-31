package model;

import Enums.Types.HexTypes;
import Enums.Types.ImprovementTypes;
import Enums.Types.LandFeatureType;
import Enums.Types.Technology;

import java.util.ArrayList;

public class Improvement {

    private ImprovementTypes improvementTypes;
    private Player owner;
    private int food;
    private int production;
    private int gold;
    private String name;
    private Technology neededTechnology;
    private ArrayList<LandFeatureType> possibleLandFeatureTypes;
    private ArrayList<HexTypes> possibleHexTypes;


    @Override
    public String toString() {
        return name;
    }

    public Improvement(ImprovementTypes improvementTypes, Player owner) {
        this.improvementTypes = improvementTypes;
        this.owner = owner;
        this.food = improvementTypes.getFood();
        this.gold = improvementTypes.getGold();
        this.production = improvementTypes.getProduction();
        this.possibleLandFeatureTypes = improvementTypes.getLandFeatureTypes();
        this.possibleHexTypes = improvementTypes.getHexTypes();
        this.name = improvementTypes.getName();
    }
}
